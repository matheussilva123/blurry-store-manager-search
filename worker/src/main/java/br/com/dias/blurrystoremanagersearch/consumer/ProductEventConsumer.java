package br.com.dias.blurrystoremanagersearch.consumer;

import br.com.dias.blurrystoremanagersearch.model.event.Envelope;
import br.com.dias.blurrystoremanagersearch.model.event.ProductEvent;
import br.com.dias.blurrystoremanagersearch.model.event.SnsMessage;
import br.com.dias.blurrystoremanagersearch.service.ProductService;
import br.com.dias.blurrystoremanagersearch.utils.JsonConverter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

import javax.jms.JMSException;
import javax.jms.TextMessage;
import java.io.IOException;

@Service
public class ProductEventConsumer {
    private static final Logger LOG = LoggerFactory.getLogger(ProductEventConsumer.class);

    private final JsonConverter jsonConverter;
    private final ProductService productService;

    @Autowired
    public ProductEventConsumer(final JsonConverter jsonConverter, final ProductService productService) {
        this.jsonConverter = jsonConverter;
        this.productService = productService;
    }

    @JmsListener(destination = "${aws.sqs.queue.product.events.name}")
    public void receiveProductEvent(final TextMessage textMessage) throws JMSException, IOException {

        final SnsMessage snsMessage = jsonConverter.toObject(textMessage.getText(), SnsMessage.class);
        final Envelope envelope = jsonConverter.toObject(snsMessage.getMessage(), Envelope.class);
        final ProductEvent productEvent = jsonConverter.toObject(envelope.getData(), ProductEvent.class);

        LOG.info("Product event received - Event: {} - ProductId: {} - ",
                envelope.getEventType(),
                productEvent.getProductId());
    }


}

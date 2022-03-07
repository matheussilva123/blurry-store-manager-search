package br.com.dias.blurrystoremanagersearch.model.event;

import br.com.dias.blurrystoremanagersearch.enums.EventType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Envelope {

    private EventType eventType;
    private String data;

}

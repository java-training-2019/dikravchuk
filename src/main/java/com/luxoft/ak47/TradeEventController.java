package com.luxoft.ak47;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;

@RestController
public class TradeEventController {


    @RequestMapping(value ="/tradeEvent", produces = MediaType.TEXT_XML_VALUE )

    String tradeEvent() {
        return "<version><version>0</version></version>";

    }
}

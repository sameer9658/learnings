package com.JAXB;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class Testing {

    public static void main(String[] args) {

        try {

            File file = new File("file1.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(WelshPostalAddress.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            WelshPostalAddress welshPostalAddress = (WelshPostalAddress) jaxbUnmarshaller.unmarshal(file);
            System.out.println(welshPostalAddress);

        } catch (JAXBException e) {
            e.printStackTrace();
        }

    }
}

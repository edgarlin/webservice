package com.demo;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.demo.dto.Level0;
import com.demo.dto.Level1;

public class DemoMain {

	public static void main(String[] args) throws Exception {

		List<Level1> l1s = new ArrayList<>();
		Level0 l0 = new Level0();
		Level1 l1a = new Level1();
		Level1 l1b = new Level1();
		l0.setString1("AAAA");
		l1a.setInt1(3);
		l1b.setInt1(4);
		l1s.add(l1a);
		l1s.add(l1b);
		l0.setLevel1s(l1s);

		JAXBContext context = JAXBContext.newInstance(Level0.class);
		Marshaller m = context.createMarshaller();
		Unmarshaller um = context.createUnmarshaller();
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		m.setProperty(Marshaller.JAXB_ENCODING, "big5");
		m.marshal(l0, System.out);

		try (StringWriter sw = new StringWriter()) {
			m.marshal(l0, sw);
			try (StringReader sr = new StringReader(sw.toString())) {
				l0 = (Level0) um.unmarshal(sr);
				System.out.println(l0.getString1());
				System.out.println(l0.getLevel1s().get(0).getInt1());
				System.out.println(l0.getLevel1s().get(1).getInt1());
			}
		} catch (Exception e) {
			
		}
	}
}

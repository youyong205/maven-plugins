package org.unidal.codegen.meta;

import java.io.IOException;
import java.io.Reader;
import java.io.StringWriter;

import org.jdom.Element;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;
import org.unidal.lookup.annotation.Inject;
import org.unidal.lookup.annotation.Named;

@Named(type = XmlMetaHelper.class)
public class DefaultXmlMetaHelper implements XmlMetaHelper {
   @Inject
   private XmlMeta m_xmlMeta;

   public String getXmlMetaContent(Reader reader) throws IOException {
      Element root = m_xmlMeta.getMeta(reader);
      XMLOutputter outputter = new XMLOutputter(Format.getPrettyFormat());
      StringWriter writer = new StringWriter(4096);

      outputter.output(root, writer);
      return writer.toString();
   }
}

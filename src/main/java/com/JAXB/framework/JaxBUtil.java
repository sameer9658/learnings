package com.JAXB.framework;

 import java.io.StringReader;
 import java.io.StringWriter;
 import java.util.HashMap;
 import javax.xml.bind.JAXBContext;
 import javax.xml.bind.JAXBException;
 public class JaxBUtil {

    static HashMap<String, JAXBContext> jaxbCache = new HashMap<String, JAXBContext>();

    /**

     * @param classes

     * @return

     */

    private static String getJaxbContextKey(Class<?> ...  classes){

        StringBuffer stringBuffer = new StringBuffer();

        if(classes != null){

            for (int i = 0; i < classes.length; i++) {

                String className = classes[i].getName();

                ClassLoader loader = classes[i].getClassLoader();

                int classLoader = 0;

                if(loader != null){

                    classLoader = loader.hashCode();

                }

                String nextEntry = className + classLoader;

                stringBuffer.append(nextEntry);

            }

        }



        return stringBuffer.toString();

    }

    /**

     * @param classes

     * @return

     */

    private static JAXBContext getJAXBContext(Class<?>... classes){

        String classKey = getJaxbContextKey(classes);

        JAXBContext result = jaxbCache.get(classKey);



        if(result == null){

            try {

                synchronized (JaxBUtil.class) {

                    result = jaxbCache.get(classKey);

                    if(result == null){

                        result = JAXBContext.newInstance(classes);

                        jaxbCache.put(classKey,result);

                    }

                }

            } catch (JAXBException e) {

                // TODO Auto-generated catch block

                e.printStackTrace();

            } catch (Exception e) {

                // TODO Auto-generated catch block

                e.printStackTrace();

            }

        }

        return result;

    }

    /**

     * @param object

     * @param class1

     * @return

     */

    public static String jaxbMarshalConvertJavaObjectToXMLTree(Object object,

                                                               Class<?> class1) {

        StringWriter writerPage = new StringWriter();

        try {

            JAXBContext jaxbContextPage = getJAXBContext(class1);

            jaxbContextPage.createMarshaller().marshal(object, writerPage);

        } catch (JAXBException e) {

            // TODO Auto-generated catch block

            e.printStackTrace();

        }

        return writerPage.toString();

    }

    /**

     * This method converts XML Tree Object to Java Object.

     *

     * @param stringReadPage –

     *            Pass Data Stream like a String object

     * @param class1 –

     *            Pass The Data Structure Class Instance

     * @return – Object of Java Data Structure, you have to Cast where you

     *         calling this method with Java Data Structure

     */

    public  static Object jaxbUNMarshalConvertXMLTreeToJavaObject(

            String stringReadPage, Class<?> class1) {

        Object dataStructureReadPage = null;

        try {

            JAXBContext jaxbContextPage = getJAXBContext(class1);

            dataStructureReadPage = (Object) jaxbContextPage

                    .createUnmarshaller().unmarshal(

                            new StringReader(stringReadPage));

        } catch (JAXBException e) {

            // TODO Auto-generated catch block

            e.printStackTrace();

        }

        return dataStructureReadPage;

    }

 }

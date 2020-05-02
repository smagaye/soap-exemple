
package sn.gestion.notes.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the sn.gestion.notes.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Moyenne_QNAME = new QName("http://service.notes.gestion.sn/", "moyenne");
    private final static QName _Rang_QNAME = new QName("http://service.notes.gestion.sn/", "rang");
    private final static QName _NomComplet_QNAME = new QName("http://service.notes.gestion.sn/", "nomComplet");
    private final static QName _MoyenneResponse_QNAME = new QName("http://service.notes.gestion.sn/", "moyenneResponse");
    private final static QName _NomCompletResponse_QNAME = new QName("http://service.notes.gestion.sn/", "nomCompletResponse");
    private final static QName _RangResponse_QNAME = new QName("http://service.notes.gestion.sn/", "rangResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: sn.gestion.notes.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link NomCompletResponse }
     * 
     */
    public NomCompletResponse createNomCompletResponse() {
        return new NomCompletResponse();
    }

    /**
     * Create an instance of {@link RangResponse }
     * 
     */
    public RangResponse createRangResponse() {
        return new RangResponse();
    }

    /**
     * Create an instance of {@link MoyenneResponse }
     * 
     */
    public MoyenneResponse createMoyenneResponse() {
        return new MoyenneResponse();
    }

    /**
     * Create an instance of {@link NomComplet }
     * 
     */
    public NomComplet createNomComplet() {
        return new NomComplet();
    }

    /**
     * Create an instance of {@link Rang }
     * 
     */
    public Rang createRang() {
        return new Rang();
    }

    /**
     * Create an instance of {@link Moyenne }
     * 
     */
    public Moyenne createMoyenne() {
        return new Moyenne();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Moyenne }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.notes.gestion.sn/", name = "moyenne")
    public JAXBElement<Moyenne> createMoyenne(Moyenne value) {
        return new JAXBElement<Moyenne>(_Moyenne_QNAME, Moyenne.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Rang }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.notes.gestion.sn/", name = "rang")
    public JAXBElement<Rang> createRang(Rang value) {
        return new JAXBElement<Rang>(_Rang_QNAME, Rang.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NomComplet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.notes.gestion.sn/", name = "nomComplet")
    public JAXBElement<NomComplet> createNomComplet(NomComplet value) {
        return new JAXBElement<NomComplet>(_NomComplet_QNAME, NomComplet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MoyenneResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.notes.gestion.sn/", name = "moyenneResponse")
    public JAXBElement<MoyenneResponse> createMoyenneResponse(MoyenneResponse value) {
        return new JAXBElement<MoyenneResponse>(_MoyenneResponse_QNAME, MoyenneResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NomCompletResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.notes.gestion.sn/", name = "nomCompletResponse")
    public JAXBElement<NomCompletResponse> createNomCompletResponse(NomCompletResponse value) {
        return new JAXBElement<NomCompletResponse>(_NomCompletResponse_QNAME, NomCompletResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RangResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.notes.gestion.sn/", name = "rangResponse")
    public JAXBElement<RangResponse> createRangResponse(RangResponse value) {
        return new JAXBElement<RangResponse>(_RangResponse_QNAME, RangResponse.class, null, value);
    }

}

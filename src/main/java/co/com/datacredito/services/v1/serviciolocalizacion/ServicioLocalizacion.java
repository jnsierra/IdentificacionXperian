package co.com.datacredito.services.v1.serviciolocalizacion;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.7.18
 * 2019-04-21T13:03:52.045-05:00
 * Generated source version: 2.7.18
 * 
 */
@WebService(targetNamespace = "http://www.datacredito.com.co/services/v1/ServicioLocalizacion", name = "ServicioLocalizacion")
@XmlSeeAlso({co.com.datacredito.services.schema.serviciolocalizacion.v1.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface ServicioLocalizacion {

    @WebMethod(action = "http://www.datacredito.com.co/ServicioLocalizacion/consultarDatosLocalizacion")
    @WebResult(name = "ConsultarDatosLocalizacionResponse", targetNamespace = "http://www.datacredito.com.co/services/schema/ServicioLocalizacion/v1", partName = "parameters")
    public co.com.datacredito.services.schema.serviciolocalizacion.v1.ConsultarDatosLocalizacionResponse consultarDatosLocalizacion(
        @WebParam(partName = "parameters", name = "ConsultarDatosLocalizacion", targetNamespace = "http://www.datacredito.com.co/services/schema/ServicioLocalizacion/v1")
        co.com.datacredito.services.schema.serviciolocalizacion.v1.ConsultarDatosLocalizacion parameters
    ) throws ServicioLocalizacionException;

    @WebMethod(action = "http://www.datacredito.com.co/ServicioLocalizacion/customConsultarDatosLocalizacion")
    @WebResult(name = "CustomConsultarDatosLocalizacionResponse", targetNamespace = "http://www.datacredito.com.co/services/schema/ServicioLocalizacion/v1", partName = "parameters")
    public co.com.datacredito.services.schema.serviciolocalizacion.v1.CustomConsultarDatosLocalizacionResponse customConsultarDatosLocalizacion(
        @WebParam(partName = "parameters", name = "CustomConsultarDatosLocalizacion", targetNamespace = "http://www.datacredito.com.co/services/schema/ServicioLocalizacion/v1")
        co.com.datacredito.services.schema.serviciolocalizacion.v1.CustomConsultarDatosLocalizacion parameters
    ) throws ServicioLocalizacionException;
}


package co.com.datacredito.services.v1.serviciolocalizacion;

import javax.xml.ws.Endpoint;

/**
 * This class was generated by Apache CXF 3.2.6
 * 2018-12-18T23:04:08.674-05:00
 * Generated source version: 3.2.6
 *
 */

public class ServicioLocalizacion_ServicioLocalizacionPortDmzHttps_Server{

    protected ServicioLocalizacion_ServicioLocalizacionPortDmzHttps_Server() throws java.lang.Exception {
        System.out.println("Starting Server");
        Object implementor = new ServicioLocalizacionPortDmzHttpsImpl();
        String address = "https://10.54.8.23:443/wss/localizacion/services/ServicioLocalizacion";
        Endpoint.publish(address, implementor);
    }

    public static void main(String args[]) throws java.lang.Exception {
        new ServicioLocalizacion_ServicioLocalizacionPortDmzHttps_Server();
        System.out.println("Server ready...");

        Thread.sleep(5 * 60 * 1000);
        System.out.println("Server exiting");
        System.exit(0);
    }
}

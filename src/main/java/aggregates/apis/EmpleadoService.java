/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aggregates.apis;

import aggregates.apis.Client.ClienteRetro;
import aggregates.request.PersonaRequest;
import aggregates.response.ResponceReniec;
import java.io.IOException;
import modelo.entity.Empleado;
import retrofit2.Call;
import retrofit2.Response;

/**
 *
 * @author FranDev
 */
public class EmpleadoService {

    ClienteRetrofitService apiService = ClienteRetro.getCliente().create(ClienteRetrofitService.class);

    String tokenApi = "apis-token-9271.0yAxnGSLu7QVAei6UQm2kjEOtg9X1u5u";

    public ResponceReniec getEntityRetrofit(PersonaRequest personaRequest) throws IOException {

        //todo== instancia de la intidad que se va a guardar
       // Empleado personaEntity = new Empleado();
        //todo== parametrizacion del objeto retrofit que se va a ejecutar
        Call<ResponceReniec> call = apiService.gerDatosPersona("Bear " + tokenApi, personaRequest.getDni());

        //todo== ejecucion de la consulta retrofit
        Response<ResponceReniec> ejecuteConsulat = call.execute();
        //todo== validacion de extito y no null
        if (ejecuteConsulat.isSuccessful() && ejecuteConsulat.body() != null) {

            //todo== pasando la respuesta del response del retrofit al objeto que entendio responseReniec
            ResponceReniec responseReniec = ejecuteConsulat.body();
            //todo== setiendo datos a la en entidad de la respueta obtenida
            //personaEntity.setNombre(responseReniec.getNombres());
            // personaEntity.setApellido(responseReniec.getApellidoPaterno());
            //  personaEntity.setApellidoMaterno(responseReniec.getApellidoMaterno());
            //  personaEntity.setNumDoc(responseReniec.getNumeroDocumento());
            //  personaEntity.setTipoDoc(responseReniec.getTipoDocumento());
            //  personaEntity.setUsuaCrea(ConstantsReniec.AUDIT_ADMIN);
            //  personaEntity.setDataCrea(new Timestamp(System.currentTimeMillis()));

            return responseReniec;

        } else {

            return null;
        }

    }

    public static void main(String[] args) throws IOException {
        EmpleadoService preuba = new EmpleadoService();

        //  preuba.getEntityRetrofit("71499800");
    }
}

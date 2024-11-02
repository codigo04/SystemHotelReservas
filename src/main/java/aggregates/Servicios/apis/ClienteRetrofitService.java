/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package aggregates.Servicios.apis;

import aggregates.response.ResponceReniec;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;

/**
 *
 * @author FranDev
 */
public interface ClienteRetrofitService {

    @GET("/v2/reniec/dni")
    Call<ResponceReniec> gerDatosPersona(@Header("Authorization") String toquen, @Query("numero") String numero);
;
}

package EstructuraBD;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Factura {

	    private int factura_id;         
	    private String pedido_id , empleado_id, fecha_emision, codigo_factura;   
	    private double monto_total;
	    
	    public Factura(int factura_id, String pedido_id, String empleado_id, String fecha_emision, double monto_total) {
	        this.factura_id = factura_id;
	        this.pedido_id = pedido_id;
	        this.empleado_id = empleado_id;
	        this.fecha_emision = fecha_emision;
	        this.monto_total = monto_total;
	        this.codigo_factura = generarCodigoFactura(factura_id);
	    }
	    
	    private String generarCodigoFactura(int idFactura) {
	        String fecha = new SimpleDateFormat("yyyyMMdd").format(new Date());
	        return String.format("FAC-%s-%06d", fecha, idFactura);
	    }
	    
	    public int getFactura_id() { return factura_id; }
	    public String getPedido_id() { return pedido_id; }
	    public String getEmpleado_id() { return empleado_id; }
	    public String getFecha_emision() { return fecha_emision; }
	    public double getMonto_total() { return monto_total; }
	    public String getCodigo_factura() { return codigo_factura; }
	    
	    public String toString() {
	        return "Factura{" +
	                "factura_id=" + factura_id +
	                ", pedido_id='" + pedido_id + '\'' +
	                ", empleado_id='" + empleado_id + '\'' +
	                ", fecha_emision='" + fecha_emision + '\'' +
	                ", monto_total=" + monto_total +
	                ", codigo_factura='" + codigo_factura + '\'' +
	                '}';
	    }
	    
	    public static void main(String[] args) {
	        Factura f = new Factura(12345, "PED-001", "EMP-005", "2025-12-02 15:45:00", 45.50);
	        System.out.println(f.getCodigo_factura()); // FAC-YYYYMMDD-012345
	    }
}

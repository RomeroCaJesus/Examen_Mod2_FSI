package pe.unjfsc.fsi.entity;

public class CEPeaje {
    String empresaConcesion;
    int rucConcesion;
    String direccionConesion;
    String ubicacionConcesion;
    String fechaPeaje;
    String horaPeaje;
    String tipoComprobante;
    String nComprobante;
    String categoria;
    double importe;
    double igv;
    double importeFinal;

    public CEPeaje() {
    }

    public CEPeaje(String empresaConcesion, int rucConcesion, String direccionConesion, String ubicacionConcesion, String fechaPeaje, String horaPeaje, String tipoComprobante, String nComprobante, String categoria, double importe) {
        this.empresaConcesion = empresaConcesion;
        this.rucConcesion = rucConcesion;
        this.direccionConesion = direccionConesion;
        this.ubicacionConcesion = ubicacionConcesion;
        this.fechaPeaje = fechaPeaje;
        this.horaPeaje = horaPeaje;
        this.tipoComprobante = tipoComprobante;
        this.nComprobante = nComprobante;
        this.categoria = categoria;
        this.importe = importe;
        igv = 0;
        importeFinal = 0;
    }

    public CEPeaje(double importe) {
        this.importe = importe;
    }
    
    public String getEmpresaConcesion() {
        return empresaConcesion;
    }

    public void setEmpresaConcesion(String empresaConcesion) {
        this.empresaConcesion = empresaConcesion;
    }

    public int getRucConcesion() {
        return rucConcesion;
    }

    public void setRucConcesion(int rucConcesion) {
        this.rucConcesion = rucConcesion;
    }

    public String getDireccionConesion() {
        return direccionConesion;
    }

    public void setDireccionConesion(String direccionConesion) {
        this.direccionConesion = direccionConesion;
    }

    public String getUbicacionConcesion() {
        return ubicacionConcesion;
    }

    public void setUbicacionConcesion(String ubicacionConcesion) {
        this.ubicacionConcesion = ubicacionConcesion;
    }

    public String getFechaPeaje() {
        return fechaPeaje;
    }

    public void setFechaPeaje(String fechaPeaje) {
        this.fechaPeaje = fechaPeaje;
    }

    public String getHoraPeaje() {
        return horaPeaje;
    }

    public void setHoraPeaje(String horaPeaje) {
        this.horaPeaje = horaPeaje;
    }

    public String getTipoComprobante() {
        return tipoComprobante;
    }

    public void setTipoComprobante(String tipoComprobante) {
        this.tipoComprobante = tipoComprobante;
    }

    public String getnComprobante() {
        return nComprobante;
    }

    public void setnComprobante(String nComprobante) {
        this.nComprobante = nComprobante;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public double getIgv() {
        return igv;
    }

    public void setIgv(double igv) {
        this.igv = igv;
    }

    public double getImporteFinal() {
        return importeFinal;
    }

    public void setImporteFinal(double importeFinal) {
        this.importeFinal = importeFinal;
    }

    @Override
    public String toString() {
        return "CEPeaje{" + "fechaPeaje=" + fechaPeaje + ", horaPeaje=" + horaPeaje + ", nComprobante=" + nComprobante + ", importe=" + importe + ", igv=" + igv + ", importeFinal=" + importeFinal + '}';
    }
}

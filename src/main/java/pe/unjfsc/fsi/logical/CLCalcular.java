package pe.unjfsc.fsi.logical;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pe.unjfsc.fsi.entity.CEPeaje;

public class CLCalcular {
    private static final Logger LOG=LoggerFactory.getLogger("ClCalcular");
    
    public void calcularImporte(CEPeaje oCEPeaje){
         LOG.info("[fsi] Objeto Entrante : {}",oCEPeaje);
         double importe = oCEPeaje.getImporte();
         double igv = importe*0.18;
         double importeFinal = importe + igv;
         LOG.info("[fsi] Importe : {}",importe);
         LOG.info("[fsi] Igv : {}",igv);
         LOG.info("[fsi] ImporteFinal : {}",importeFinal);
         oCEPeaje.setIgv(igv);
         oCEPeaje.setImporteFinal(importeFinal);
         LOG.info("[fsi] Objeto resultante : {}",oCEPeaje);
    }
}

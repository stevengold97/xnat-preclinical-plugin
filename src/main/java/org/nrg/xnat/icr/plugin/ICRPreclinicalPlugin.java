package org.nrg.xnat.icr.plugin;

/**
 * Created by sgold on 03/08/2017.
 */
import org.nrg.framework.annotations.XnatDataModel;
import org.nrg.framework.annotations.XnatPlugin;
import org.springframework.context.annotation.Bean;
import org.nrg.xdat.bean.IcrPreclinicaldemographicdataBean;

@XnatPlugin(value = "icrPreclinicalPlugin", name="XNAT 1.7 Preclinical Plugin",
            description = "This is a plugin for XNAT 1.7, which includes a new preclinical data type and alters the 'edit subject' page by adding demographic data relevant to preclinical research.",
            dataModels = @XnatDataModel(value = IcrPreclinicaldemographicdataBean.SCHEMA_ELEMENT_NAME,
                                        singular = "Demographic datum",
                                        plural = "Demographic data"))

public class ICRPreclinicalPlugin {
    @Bean
    public String PluginMessage() {
        return "Hello world";
    }
}

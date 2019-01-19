package br.org.project.design_patterns.behavior.flyweight.pattern;

import br.org.project.design_patterns.behavior.flyweight.old.CPlataforma;
import br.org.project.design_patterns.behavior.flyweight.old.JavaPlataforma;
import br.org.project.design_patterns.behavior.flyweight.old.PhytonPlataforma;
import br.org.project.design_patterns.behavior.flyweight.old.Plataforma;

import java.util.HashMap;
import java.util.Map;

public class PlataformaFactory {

    private static Map<String, Plataforma> map = new HashMap<>();
    private PlataformaFactory(){
        throw new AssertionError("Cannot instantiate the class");
    }
    public static synchronized Plataforma getPlatformInstance(String platformType){
        Plataforma platform = map.get(platformType);
        if(platform==null){
            switch(platformType){
                case "C" : platform = new CPlataforma();
                    break;
                case "JAVA" : platform = new JavaPlataforma();
                    break;
                case "PHYTON" : platform = new PhytonPlataforma();
                    break;
            }
            map.put(platformType, platform);
        }
        return platform;
    }

}

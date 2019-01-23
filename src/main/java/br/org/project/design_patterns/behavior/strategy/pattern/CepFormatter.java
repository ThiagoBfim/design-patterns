package br.org.project.design_patterns.behavior.strategy.pattern;

public class CepFormatter implements MaskFormatter {
    @Override
    public String includeMask(String text) {
        if(text != null){
            return text.replaceFirst("(\\d{5})(\\d{3})", "$1-$2");
        }
        return null;
    }
}

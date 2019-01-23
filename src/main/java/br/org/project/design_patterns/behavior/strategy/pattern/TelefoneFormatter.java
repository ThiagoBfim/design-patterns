package br.org.project.design_patterns.behavior.strategy.pattern;

public class TelefoneFormatter implements MaskFormatter {
    @Override
    public String includeMask(String text) {
        if(text != null){
            return text.replaceFirst("(\\d{4})(\\d{4})", "$1-$2");
        }
        return null;
    }
}

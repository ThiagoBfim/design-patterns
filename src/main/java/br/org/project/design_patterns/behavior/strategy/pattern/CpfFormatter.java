package br.org.project.design_patterns.behavior.strategy.pattern;

public class CpfFormatter implements MaskFormatter {
    @Override
    public String includeMask(String text) {
        if(text != null){
            return text.replaceFirst("(\\d{3})(\\d{3})(\\d{3})(\\d{2})", "$1.$2.$3-$4");
        }
        return null;
    }
}

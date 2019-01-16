package br.org.project.design_patterns.behavior.observable;

import br.org.project.design_patterns.behavior.observable.pattern.CommentaryObjectObservable;
import br.org.project.design_patterns.behavior.observable.pattern.EmailObservable;
import br.org.project.design_patterns.behavior.observable.pattern.IObservable;
import br.org.project.design_patterns.behavior.observable.pattern.SMSObservable;

import java.util.Arrays;

/**
 * Pattern:
 *  Problema:   Está ocorrendo um jogo de futebol, na qual as pessoas podem se inscrever. Assim que for feita a inscrição, os comentários do jogo serão enviados para essa pesssoa.
 *              É necessário criar uma forma de notificar varios usuarios quando houver uma alteração.
 *  Solução:    Criar uma classe que seja responsável por receber os comentários e repassar para os observadores.
 *
 *  Observable Pattern :
 *      * O padrão observable tem como principal funcionalidade notificar seus observadores quando alguma coisa acontecer.
 *      * Esse padrão pode ser utilizado quando a alteração em um objeto refletir em outros, e você não sabe quandos objetos serão afetados.
 *      * Quando um objeto precisar notificar outros objetos sem precisar que sejam fortemente acoplados.
 *
 * Note: O java já fornece duas interfaces para implementação do Observable.
 *       Eu particulamente considero esse um ótimo padrão de projeto.
 * @see java.util.Observer
 * @see java.util.Observable
 */
public class TestObservable {

    public static void main(String[] args) {
        CommentaryObjectObservable obj = new CommentaryObjectObservable("Jogo de Futebol");
        SMSObservable observer = new SMSObservable(obj, "Joaõ Pereira");
        observer.subscribe();

        EmailObservable emailSubscribe1 = new EmailObservable(obj, "Thiago");
        emailSubscribe1.subscribe();
        EmailObservable emailSubscribe2 = new EmailObservable(obj, "Luiz Silva");
        emailSubscribe2.subscribe();

        gamePlay(obj, observer, emailSubscribe1);
    }

    private static void gamePlay(CommentaryObjectObservable obj, IObservable... observer) {
        obj.setDesc("Welcome to live Soccer match");
        obj.setDesc("Current score 0-0");
        Arrays.asList(observer).forEach(IObservable::unSubscribe);
        obj.setDesc("It’s a goal!!");
        obj.setDesc("Current score 1-0");
    }
}
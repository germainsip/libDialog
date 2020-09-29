package org.germain

fun main() {
    var message: String = "Bonjour \n" +
            "Comment t' appel tu ?"

    //Fen.afficheTest(message)
    /*message = Fen.attendRéponse(message)
    print(Fen.afficheTest("Salut $message \n" +
            "Entre une phrase"))*/
    var res : String = Fen.OuiNon("oui").toString()
    print("$res || oui")
    res = Fen.OuiNon("non").toString()
    print("$res || non")
    res = Fen.OuiNon("annuler").toString()
    print("$res || annuler")
}
package org.germain

import java.awt.BorderLayout
import java.awt.GridBagLayout
import java.net.MalformedURLException
import javax.swing.*

object Fen {
    val icone = ImageIcon(Fen::class.java.getResource("asset/unnamed.jpg"))
    private val icon: Icon = icone
    fun afficheMessage(message: String?) {
//
        JOptionPane.showMessageDialog(null, message)
    }

    @Throws(MalformedURLException::class)
    fun afficheTest(question: String?): String {
        val label = JLabel(icon)
        val panel = JPanel(GridBagLayout())
        panel.add(label)
        val textPanel = JPanel()
        textPanel.add(JLabel(question))
        val panel2 = JPanel(BorderLayout())
        panel2.add(textPanel)
        panel2.add(panel, BorderLayout.EAST)
        return JOptionPane.showInputDialog(null, panel2, "Course", JOptionPane.DEFAULT_OPTION)
    }

    @Throws(MalformedURLException::class)
    fun attendRéponse(question: String?): String {
        val reponse: String
        reponse = JOptionPane.showInputDialog(question)
        return reponse
    }
    fun afficheTest2(question: String?): Int {

        return JOptionPane.showConfirmDialog(null, question)
    }
}
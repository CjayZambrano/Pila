package pila;

import pila.Lanzamiento;
import pila.OperacionesPila;
import pila.Pila;

/**
 *
 * @author david_orlando.mena@uao.edu.co David Orlando Mena 2180448 
 * @author frank_dan.castillo@uao.edu.co Frank Daniel Castillo 2171721
 * @author cjay.zambrano@uao.edu.co Cjay Zambrano Liñan 2151536
 * @author maria_camila.reina@uao.edu.co Maria Camila Reina 2190037
 * @date Feb 2021 
 */ 
public class Tools
{

    /**
     * Metodo que recibe una pila y convierte su contenido en un documento en formato
     * HTML para su posterior visualización.
     * El metodo hace usa copia profunda para asegurar que no se toquen o destruyan los datos 
     * de la pila original <code>p</code>.
     * @param p
     * @return 
     */
    public static String convertirPilaAHtml(Pila<Lanzamiento> p)
    {
        StringBuilder sb = new StringBuilder("<html>");
        Pila<Lanzamiento> q = OperacionesPila.duplicar(p);
        
        sb.append("<noscript>").append("</noscript>");
        
        if (!q.estaVacia())
        {
            sb.append("<table align=\"center\" border=\"2\">");
            sb.append("<tr>").append("<th>").append("Texto").append("</th>").append("</tr>");
            do
            {
                Lanzamiento e = q.desapilar();
                sb.append("<tr>").append("<td>");
                //sb.append(e.getTexto());
                sb.append("</td>").append("</tr>");
            }
            while (!q.estaVacia());
            sb.append("</table>");
        }
        else
        {
            sb.append("<h1 align=\"center\">").append("Pila Vacia").append("</h1>");
        }
        
        sb.append("</html>");
        
        return sb.toString();
    }

    /**
     * Metodo que inyecta código HTML en un documento buscando la marca <code>script</code>, esto es util
     * para delegar tareas que no se deben o quieren realizar en el procesamiento principal.
     * @param p
     * @param texto
     * @return 
     */
    public static String convertirPilaAHtml(Pila<Lanzamiento> p, String texto)
    {
        String html = "<br><center>Se retiro " + texto + "</center></br>";
        StringBuilder sb = new StringBuilder(convertirPilaAHtml(p));
        try
        {
            sb.replace(sb.indexOf("<noscript>"), sb.indexOf("</noscript>"), html);
        }
        catch (StringIndexOutOfBoundsException ex)
        {
        }
        
        return sb.toString();
    }

}

/*
 * @author Jairo Andrés
 */
//Para realizar pruebas
import java.util.*;


public class Main {

    public static void main(String[] args) {
        
        LeerArchivoCSV l = new LeerArchivoCSV();
        l.leerYAlmacenarLineasCSV();
        Preprocesamiento p = new Preprocesamiento(l.obtenerListaComentariosLeidos());        
        p.eliminarPalabrasVacias();
        System.out.println("Cantidad comentarios: "+l.obtenerListaComentariosLeidos().size());
        p.imprimirMensajesParaProcesar();
        System.out.println("\n**********************************\n");
        p.imprimirMensajesProcesados();
        

        String s = "‎‎‎‎‎‎hola! ¿mundo";
        StringTokenizer st = new StringTokenizer(s);
        System.out.println(st.nextToken());
        System.out.println(st.nextToken());
    }
}

/*StringTokenizer s = new StringTokenizer("a, acuerdo, adelante, ademas, además, adrede, ahi, ahí, ahora, al, "
                + "alli, allí, alrededor, antano, antaño, ante, antes, apenas, aproximadamente, "
                + "aquel, aquél, aquella, aquélla, aquellas, aquéllas, aquello, aquellos, aquéllos, "
                + "aqui, aquí, arriba, abajo, asi, así, aun, aún, aunque, b, bajo, bastante, bien, "
                + "breve, c, casi, cerca, claro, como, cómo, con, conmigo, contigo, contra, cual, "
                + "cuál, cuales, cuáles, cuando, cuándo, cuanta, cuánta, cuantas, cuántas, cuanto, "
                + "cuánto, cuantos, cuántos, d, de, debajo, del, delante, demasiado, dentro, deprisa, "
                + "desde, despacio, despues, después, detras, detrás, dia, día, dias, días, donde, "
                + "dónde, dos, durante, e, el, él, ella, ellas, ellos, en, encima, enfrente, enseguida, "
                + "entre, es, esa, ésa, esas, ésas, ese, ése, eso, esos, ésos, esta, está, ésta, estado, "
                + "estados, estan, están, estar, estas, éstas, este, éste, esto, estos, éstos, ex, "
                + "excepto, f, final, fue, fuera, fueron, g, general, gran, h, ha, habia, había, habla, "
                + "hablan, hace, hacia, han, hasta, hay, horas, hoy, i, incluso, informo, informó, j, "
                + "junto, k, l, la, lado, las, le, lejos, lo, los, luego, m, mal, mas, más, mayor, me, "
                + "medio, mejor, menos, menudo, mi, mí, mia, mía, mias, mías, mientras, mio, mío, mios, "
                + "míos, mis, mismo, mucho, muy, n, nada, nadie, ninguna, no, nos, nosotras, nosotros, "
                + "nuestra, nuestras, nuestro, nuestros, nueva, nuevo, nunca, o, os, otra, otros, p, pais, "
                + "paìs, para, parte, pasado, peor, pero, poco, por, porque, pronto, proximo, próximo, puede, "
                + "q, qeu, que, qué, quien, quién, quienes, quiénes, quiza, quizá, quizas, quizás, r, "
                + "raras, repente, s, salvo, se, sé, segun, según, ser, sera, será, si, sí, sido, siempre, "
                + "sin, sobre, solamente, solo, sólo, son, soyos, su, supuesto, sus, suya, suyas, suyo, t, "
                + "tal, tambien, también, tampoco, tarde, te, temprano, ti, tiene, todavia, todavía, "
                + "todo, todos, tras, tu, tú, tus, tuya, tuyas, tuyo, tuyos, u, un, una, unas, uno, unos, "
                + "usted, ustedes, v, veces, vez, vosotras, vosotros, vuestra, vuestras, vuestro, vuestros, "
                + "w, x, y, ya, yo, z",",");*/
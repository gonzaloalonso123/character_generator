
package Generador;

import java.util.Random;

public class MaquinaCreativa {
    
    static String[] sustBestiaLv1 = {"Zascandil","Trasgo","Orco","Troll","Esbirro","Ser","Bandido","Estafador","Prestidigitador",
        "Esperpento", "Monstruo", "Animal", "Navajero", "Trozo de carne", "Duende", "Gnomo", "Elfo", "Traidor", "Jefecillo",
        "Saqueador", "Ladronzuelo", "Mercader", "Vagabundo", "Muerto de hambre", "Semi-cadaver", "Duendecillo", "Ser del musgo",
        "Ser del barro", "Bandido", "Villano", "Guerrero", "Luchador", "Mercenario", "Fugitivo", "Elfo oscuro", "Ente", "Bastardo",
        "Diablillo", "Demonio", "Esclavo"};
    static String[] adjBestiaLv1 = {"mugriento", "sarnoso", "putrido", "malholiente", "miserable","astuto", "despreciable","torpe",
        "medio muerto", "sin palabra", "sin brazo", "tuerto", "estupido", "de mala madre", "huerfano","con un pasado turbio",
        "de pocas luces", "zarrapastroso", "borracho", "inútil", "sucio", "despeinado", "nervioso", "cojo", "feo", "hosco", "cansado",
        "antipático", "gruñón","avaricioso","ambicioso", "infiel", "malvado", "poco agraciado", "al que le falta una oreja", "poseido",
        "asustado", "cobarde", "aberrante", "roñoso", "leproso", "desnutrido", "encorvado", "pobre", "de poca monta", "infame",
        "cruel", "andrajoso", "aturdido", "lleno de cicatrices", "tatuado", "del barro", "de las montañas", "de origen desconocido",
        "encadenado"};
    static String[] detBestiaLv1 = {"que no tiene nada que perder", "al que se le ha encomendado una misión","en busca de alimento",
        "ansioso por traicionar a alguien", "navaja en mano", "cuyo segundo nombre es ruina", "casado con el fracaso",
        "perdido en el bosque", "perdido en la ciudad", "tirado en un callejon", "que busca mejorar su suerte", "pidiendote calderilla",
        "contratado por un canalla", "en busca de setas", "que miente más que habla", "que tiene un viejo mapa", "que camina sin rumbo",
        "sin ganas de vivir", "que porta un cuchillo", "que hace tiempo olvidó su nombre", "que le debe algo a alguien","enamorado de un ent",
        "que lleva una roída túnica", "montado sobre un jabalí", "a lomos de una rata", "que finge leer un pergamino",
        "que busca a alguien llamado Strunk", "que porta un garrote", "que porta una maza", "al cual sigue una oveja", "con un loro al hombro",
        "en cuya nariz hay una araña", "que no teme la muerte", "ansioso por causar el mal", "al que desterraron en el pasado",
        "que se siente culpable", "con un grano mugriento", "al que ya no le quedan dientes", "seguido por una innombrable bestia",
        "que presume de haber matado a un dragon", "que dice conocer un antiguo secreto", "al cual torturaron y ahora no tiene nombre",
        "que lleva tatuada en el cuello la muerte", "que se esfuerza por mejorar", "que te roba el bocadillo navaja en mano",
        "chupador de cadaveres", "que devora seres vivos en su tiempo libre", "que ataca animales indefensos del bosque",
        "cuyo padre lo abandonó al nacer", "que dice ser hijo de un rey", "el cual hizo un pacto con un demonio y aun lo paga",
        "cuya cara esta quemada", "que traicionó a su propio hijo", "al que busca la ley por un terrible delito", "que lleva años encadenado y por fin esta libre",
        "subido sobre un terrible lobo del bosque oscuro", "que se alimenta únicamente de setas", "que se dedica al comercio de yerbas prohibidas",
        "que fue expulsado del reino y se mueve en la sombra", "que busca el amor desesperadamente", "en cuyo hombro hay tres ratas",
        "que por colgante lleva una cabeza reducida"};   
    static String[] sustBestiaLv2 = {"Guerrero", "Gladiador", "Luchador", "General", "Comandante", "Caballero", "Espadachín", "Escudero",
        "Templario", "Mercenario", "Guardián", "Señor de la guerra", "Principe", "Hombre"};
    static String[] adjBestiaLv2 = {"ágil", "diestro", "fuerte", "valiente", "honorable", "cansado", "sin rumbo", "de tierras lejanas", "extranjero",
        "habilidoso", "obeso", "de fuerza titánica", "de musculosos brazos", "de noble mirada", "noble", "ambicioso", "sereno", "de ojos azules",
        "de ojos rojos", "esbelto", "musculoso", "de brillante armadura", "cuya cara cubre un casco"};
    static String[] detBestiaLv2 = {"en busca de nuevas aventuras", "que protege a una bella princesa", "cuya capa esta tejida en piel de dragón",        
        "cuyo apodo es ´cazador de goblins´", "en busca de un malhechor al que ensartar", "que fue humillado pero ha recuperado su honor",
        "que blande una espada llamada esperanza", "que empuña un arma de oro trasgo", "en cuyo escudo se dibujan enrevesadas filigranas",
        "que es hijo de un rey, aunque lo mantiene en secreto", "que ha librado muchas batallas", "que no teme el peligro", "al que apasiona el arte",
        "que toca el piano para el rey", "que hace tiempo dejó la ciudadela y ahora ha vuelto", "que sale victorioso de un torneo",
        "que monta un caballo blanco", "que monta un leon dorado del este", "que va a lomos de una cabra", "al que sigue un perro fiel",
        "al que sigue un rebaño de ovejas", "que hizo una promesa y ahora ha de cumplirla", "que jamás ha usado la mentira como arma", 
        "cuyo corazón es noble", "que ha participado en múltiples batallas", "que tiene una terrible premonición", "que estudia alquimia",
        "que lucha por lo que considera justo", "que sólo podrá decir su nombre cuando haya abatido a Raskt", "que tiene por mascota un gato negro",
        "que lleva en la mano un pergamino de conjuros", "que viaja por la tierra dibujando mapas", "que en su infancia se dedicó al pastoreo, pero ahora su oficio es la guerra"
    };
    static String[] sustBestiaLv3 = {"Angel", "Elfo", "Guardián", "Héroe", "Salvador", "Luchador", "Guerrero", "Semi-dios", "Rey", "Gobernador", "Comandante",
    	"Eminencia", "Sabio", "Filósofo", "Capitán", "Amigo", "Maestro", "Lord"};
    static String[] adjBestiaLv3  =  {"legendario", "épico", "inmortal", "invencible", "venerable", "indestructible", "ágil", "hermoso", "de increible musculatura", "apuesto",
    	"respetado en ambos confines", "entrenado por un espíritu", "de espeso pelaje", "de considerable estatura", "habilidoso", "anciano", "joven", "apuesto", "noble", "generoso"};
    static String[] detBestiaLv3  =  {"que porta un escudo de rubíes y diamantes", "cuya espada brilla con fuego azul", "que ha matado a muchos villanos, pero es humilde", "que ayudó a derrotar al orco Krugark",
    	"de cuya espalda surgen blancas alas", "que disfruta de un banquete", "que ha aniquilado cientos de trasgos", "que además cocina bien", "que blande una espada llamada esperanza",
    	"que ha sido bendecido por los antiguos", "que camina seguro", "con una mujer en cada brazo", "que lleva por collar una cabeza reducida", "que es honorable", "cuyo nombre el mal teme",
    	"que lucha sin piedad contra demonios ancianos", "a lomos de un gigantesco lobo blanco", "a lomos de un caballo blanco", "que porta una maza de hierro negro", "que lleva en la mano derecha una llave, y en la izquierda"
    			+ "una espada demoniaca","que conoce poderosos hechizos", "que sabe invocar al fuego", "que conversa con un ente de otra dimensión", "que salvó a la princesa Nahidi", "que detesta el mal", "que ayuda al débil",
    			"cuyo apodo es \"La Bestia\"", "cuya leyenda está por escribir", "a quien sigue un ave fénix","a quien sigue un consejero invisible" };
    
    static String[] nombres1_1 = {"Ra", "Surk" ,"Nar", "Za", "Re", "Suk", "Su", "Rag", "Rad", "Tre", "Srra", "Vrog", "Kar", "Ker", "Kur", "Kor", "Gor", "Ruk", "Skra", "Rak", "Zur","Zuk","Na","Den","Rug","Sa","A",
    		"O","E","I","U","N","K","S","K","G", "Rk", "Gast"};
    static String[] nombres2_1 = {"De", "Le", "Sar", "Var", "-", "Lor", "Rian", "Des", "Vri", "Tri","San","Dri","Lad", "Ren", "Vid", "Ean", "Dir", "Sar",
    		"Van","Der","Can", "Di","Son", "Nar", "Ven", "Ben", "Daer","Er","Ar","Ao","Tan","A","E","I", "Ran", "Sion", "Dorian", "Rian", "En", "El", "Eld", "Ald"};
    static String[] nombres2_2 = {"El sabio", "El fuerte", "El grande", "El serio", "El elegido", "El antiguo", "El arcano", "El Daer", "El legendario", "El humilde",
    		"El salvador","El temido","El amado", "El soberano","El invencible", "El guerrero", "El descendido"};
    
    
    static String[][] varianzas = {{"que mató a un","perseguido por un", "famoso por matar a un", "que viaja con un", "bendecido por un","cuyo padre es un"},
    		{"que porta un","en busca de un", "que viene de vender un", "que trata de vender un", "que ha conseguido un", "que en su bolsillo lleva un"}};
    static String[][] varianzas2 = {{"demonio","ángel","animal","guerrero","esbirro","ser","monstruo"},
    		{"mapa", "arma", "anillo", "pergamino", "diario", "hechizo", "secreto", "guante", "invento","objeto"}};
    static String[][] varianzas3 = {{"anciano", "letal", "peligroso", "malvado", "torpe", "conocido","de las cuevas", "de las profundidades","del averno","infernal", "de las tierras negras", "de tierras lejanas", "invisible", "maldito" },
    		{"maldito","poderoso","valioso","antiguo","","bendito","mágico","increible", "de gran valor","de color rojo", ""
    		+ "sin nombre","de sombra", "de fuego", "letal", "demoniaco", "bendito", "legendario"}};
    public static String nuevoNombre(int nivel) {
    	
    	Random r = new Random();
    	int longitud = r.nextInt(4) + 1;
    	String nombre = "";
    	switch(nivel)
    	{
    	case 1 :
    		for(int i = 0; i < longitud; i++)
    			if(i == 0)
    				nombre+=nombres1_1[r.nextInt(nombres1_1.length)];
    			else
    				nombre+=nombres1_1[r.nextInt(nombres1_1.length)].toLowerCase();
    		break;
    		
    	case 2 :
    		for(int i = 0; i < longitud; i++)
    			if(i == 0)
    				nombre+=nombres2_1[r.nextInt(nombres2_1.length)];
    			else
    				nombre+=nombres2_1[r.nextInt(nombres2_1.length)].toLowerCase();
    		break;
    		
    	case 3 :
    		for(int i = 0; i < longitud; i++)
    			if(i == 0)    			
    				nombre+=nombres2_1[r.nextInt(nombres2_1.length)];    			
    			else   			
    				nombre+=nombres2_1[r.nextInt(nombres2_1.length)].toLowerCase();
    		
    	
    			nombre+= " " + nombres2_2[r.nextInt(nombres2_2.length)];  		
    		break;
    	}
    	if(nombre.length() == 1)
    	{
    		nombre += nombres2_1[r.nextInt(nombres2_1.length)].toLowerCase();
    	}
    	return nombre;
    }
    public static String nuevaDescripcion(int nivel)
    {
        Random r = new Random();
        String descripcion = "";
        switch(nivel)
        {
            case 1:
                descripcion = sustBestiaLv1[r.nextInt(sustBestiaLv1.length)] + ' ' + adjBestiaLv1[r.nextInt(adjBestiaLv1.length)] + ' ' + detBestiaLv1[r.nextInt(detBestiaLv1.length)] + ".";
            case 2:
                descripcion = sustBestiaLv2[r.nextInt(sustBestiaLv2.length)] + ' ' + adjBestiaLv2[r.nextInt(adjBestiaLv2.length)] + ' ' + detBestiaLv2[r.nextInt(detBestiaLv2.length)] + ".";
            case 3:
                descripcion = sustBestiaLv3[r.nextInt(sustBestiaLv3.length)] + ' ' + adjBestiaLv3[r.nextInt(adjBestiaLv3.length)];
                if(r.nextBoolean()) {
                	descripcion += " " + detBestiaLv3[r.nextInt(detBestiaLv3.length)] + ".";  
                }
                else {
                	int tipo = r.nextInt(2);
                	descripcion += " " + varianzas[tipo][r.nextInt(varianzas[tipo].length)] + " " + varianzas2[tipo][r.nextInt(varianzas2[tipo].length)] + " " + varianzas3[tipo][r.nextInt(varianzas3[tipo].length)] + ".";
                }
        }
        return descripcion;
    }
}
    


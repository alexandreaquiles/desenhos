import java.util.List;

class Desenhos  {

    public static List<Desenho> lista() {
        Desenho popeye = new Desenho("Popeye", 1920);
        Desenho picaPau = new Desenho("Pica-pau", 1940);
        Desenho flintstones = new Desenho("Flintstones", 1960);
        Desenho scoobyDoo = new Desenho("Scooby-Doo", 1970);
        Desenho dragonBall = new Desenho("Dragon Ball", 1980);
        Desenho simpsons = new Desenho("Simpsons", 1990);
        Desenho meninasSuperPoderosas = new Desenho("Meninas Super Poderosas", 1990);
        Desenho caillou = new Desenho("Caillou", 2010);
        return List.of(popeye, picaPau, flintstones, scoobyDoo, simpsons, dragonBall, meninasSuperPoderosas, caillou);
    }


}

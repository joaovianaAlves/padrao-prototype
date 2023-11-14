
/**
 * Escreva uma descrição da classe ShapeApp aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class ShapeApp {
    public static void main(String[] args) {
        Circle originalCircle = new Circle();
        originalCircle.makeVisible();

        try {
            Circle clonedCircle = (Circle) originalCircle.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        
        Square originalSquare = new Square();
        originalSquare.makeVisible();

        try {
            Square clonedSquare = (Square) originalSquare.clone();
        } catch (CloneNotSupportedException e) {
           System.out.println(e);
        }

        Triangle originalTriangle = new Triangle();
        originalTriangle.makeVisible();

        try {
            Triangle clonedTriangle = (Triangle) originalTriangle.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
    }
}


public class Lapis {

private FiguraGeometrica figura;
	
	public Lapis(FiguraGeometrica figura){
		this.figura = figura;
	}
	
	public void acao(){
		this.figura.desenha();
	}

	public FiguraGeometrica getFigura() {
		return figura;
	}

	public void setFiguraGeometrica(FiguraGeometrica figura) {
		this.figura = figura;
	}
}

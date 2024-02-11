//64050030 Kitipum Nornua

/* the former violated the SOLID Principle because we need to keep re-editing new upcoming instances.
 * Can be fixed by using interface with concrete classes, then in Manager, works with interface only.  
*/
public class ImageManager {
	private RendererInterface renderer;

	public void setRenderer(RendererInterface renderer){
		this.renderer = renderer;
	}

	public void show(){
		renderer.showImage();
	}
}


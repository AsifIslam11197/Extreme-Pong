package paddles;

import objects.Ball;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.utils.TimeUtils;
import com.mygdx.game.Player;
import com.mygdx.game.Pong;

public class EarthPaddle extends Paddle {

	public EarthPaddle(Pong gam, int _upkey, int _downkey, int _PUkey,
			int _SPkey, int _x, int _y, int _velocity, int _type, boolean _isA) {
		super(gam, _upkey, _downkey, _PUkey, _SPkey, _x, _y, _velocity, _type, _isA);
		
		texture = new Texture("EarthPaddle.png");
		height = 180;
	}
	
	

}

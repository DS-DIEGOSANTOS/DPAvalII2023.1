package br.edu.ifba.inf011.model;

import br.edu.ifba.inf011.state.PlayerAllState;
import br.edu.ifba.inf011.state.PlayerState;
import br.edu.ifba.inf011.state.RandomModeState;
import br.edu.ifba.inf011.state.RepeatAllState;

import java.util.List;

public enum PlayerMode {
	PlayerAll {
		public PlayerState createState(List<Component> components) {
			return new PlayerAllState(components);
		}
	},
	RepeatAll {
		public PlayerState createState(List<Component> components) {
			return new RepeatAllState(components);
		}
	},
	RandomMode {
		public PlayerState createState(List<Component> components) {
			return new RandomModeState(components);
		}
	};

	public abstract PlayerState createState(List<Component> components);
}

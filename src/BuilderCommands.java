import java.util.HashMap;
import java.util.Map;

public class BuilderCommands {
  Map<String, Runnable> commands;

  public BuilderCommands() {
    this.commands = new HashMap<>();
  }

  public BuilderCommands setCommand(Commands key, Runnable cmd) {
    commands.put(key.getValue(), cmd);
    return this;
  }

  public BuilderCommands run(String key) {
    commands.get(key).run();
    return this;
  }
}

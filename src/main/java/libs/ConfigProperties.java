package libs;

import org.aeonbits.owner.Config;
public interface ConfigProperties extends Config {
    long TIME_FOR_DEFAULT_WAIT();
    long TIME_FOR_EXPLICIT_WAIT();
    long TIME_FOR_EXPLICIT_WAIT_HIGHT();

    String base_Url();
    String DATA_FILE();
    String DATA_FILE_PATH();
    String Oracle();
    String MySQL();
    String sqlServer();
}

package beephone_shop_projects.utils;

import beephone_shop_projects.infrastructure.constant.ConstantSystems;
import lombok.extern.slf4j.Slf4j;
//import org.apache.log4j.Logger;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

@Slf4j
public class PropertiesReader {
  private PropertiesReader() {
  }

  private static Properties applicationProperties = new Properties();
  private static Properties validationProperties = new Properties();
//  private static Logger logger = Logger.getLogger(PropertiesReader.class);

  static {
    // Load application properties file
    try (
            InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream(ConstantSystems.FileProperties.PROPERTIES_APPLICATION);
            InputStreamReader reader = new InputStreamReader(is, ConstantSystems.ENCODING_UTF8);) {
      applicationProperties.load(reader);
    } catch (IOException e) {
//      logger.error(e.getMessage());
    }
    // Load validation properties file
    try (
            InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream(ConstantSystems.FileProperties.PROPERTIES_VALIDATION);
            InputStreamReader reader = new InputStreamReader(is, ConstantSystems.ENCODING_UTF8);
    ) {
      validationProperties.load(reader);
    } catch (IOException e) {
//      logger.error(e.getMessage());
    }
  }

  /**
   * @param propertyName
   * @return Property values in {@code messages.properties} file. If you want to
   * get property values in {@code application.properties}, use
   * {@code getProperty(propertyName, Constants.PROPERTIES_APPLICATION)}
   * instead.
   */
  public static String getProperty(String propertyName) {
    return getProperty(propertyName, ConstantSystems.FileProperties.PROPERTIES_VALIDATION);
  }

  public static String getProperty(String propertyName, String propertiesType) {
    switch (propertiesType) {
      case ConstantSystems.FileProperties.PROPERTIES_APPLICATION:
        return applicationProperties.getProperty(propertyName);
      case ConstantSystems.FileProperties.PROPERTIES_VALIDATION:
        return validationProperties.getProperty(propertyName);
      default:
        return null;
    }
  }


}

package code.annotated;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * This class is meant for Auto Configuration of the beans present in the package code.annotated.
 * It scans the package and create beans with the general names for all the classes.
 * @author Somsurya Nanda
 *
 */

@Configuration
@Primary
@ComponentScan(basePackages= {"code.annotated"})
public class AutoPhoneConfig
{

}

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.JsonNode;
import org.junit.*;

import static org.junit.Assert.*;

import play.mvc.*;
import play.test.*;
import play.data.DynamicForm;
import play.data.validation.ValidationError;
import play.data.validation.Constraints.RequiredValidator;
import play.i18n.Lang;
import play.libs.F;
import play.libs.F.*;

import static play.test.Helpers.*;
import static org.fest.assertions.Assertions.*;

import models.*;


/**
*
* Simple (JUnit) tests that can call all parts of a play app.
* If you are interested in mocking a whole application, see the wiki for more details.
*
*/
public class ApplicationTest {

    /**
     * Test sur une attaque
     */
    public void donneAttaque(Gc att, Gc def, Integer pvrestant) {

        att.attaque(def);

        assertThat(def.getPv()).isEqualTo(pvrestant);

        if(pvrestant > 0){
            assertThat(def.estMort()).isEqualTo(Boolean.FALSE);
        } else {
            assertThat(def.estMort()).isEqualTo(Boolean.TRUE);
        }
    }

    @Test
    public void attaque(){
        donneAttaque(new Gc(), new Gc(), 100);
    }
}

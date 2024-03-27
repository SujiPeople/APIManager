package APIManager.Entity;

/*
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class DynamicEntity {

    @Id
    private Long id;

    // 동적으로 추가될 필드를 저장하는 맵
    private Map<String, Object> dynamicFields = new HashMap<>();

    // 기본 생성자
    public DynamicEntity() {}

    // id getter, setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // 동적 필드 getter, setter
    public Object getDynamicField(String fieldName) {
        return dynamicFields.get(fieldName);
    }

    public void setDynamicField(String fieldName, Object value) {
        dynamicFields.put(fieldName, value);
    }

    // 필요한 경우 추가적인 메서드를 정의할 수 있음

    // Reflection을 사용하여 동적으로 필드를 추가하는 메서드
    public static DynamicEntity createDynamicEntity(Class<?> clazz, Map<String, Object> fieldValues) throws Exception {
        DynamicEntity dynamicEntity = new DynamicEntity();

        // 클래스에 선언된 모든 필드를 가져와서 dynamicFields 맵에 추가
        for (Field field : clazz.getDeclaredFields()) {
            field.setAccessible(true);
            dynamicEntity.setDynamicField(field.getName(), fieldValues.get(field.getName()));
        }

        return dynamicEntity;
    }
}

/*
public class Main {
    public static void main(String[] args) throws Exception {
        Map<String, Object> fieldValues = new HashMap<>();
        fieldValues.put("id", 1L);
        fieldValues.put("username", "john");
        fieldValues.put("email", "john@example.com");

        DynamicEntity dynamicEntity = DynamicEntity.createDynamicEntity(User.class, fieldValues);

        System.out.println(dynamicEntity.getDynamicField("id"));  // 1
        System.out.println(dynamicEntity.getDynamicField("username"));  // john
        System.out.println(dynamicEntity.getDynamicField("email"));  // john@example.com
    }
}

*/
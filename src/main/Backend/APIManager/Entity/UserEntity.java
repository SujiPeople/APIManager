package APIManager.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@SuppressWarnings("deprecation")
@Data
//@NoArgsConstructor(access = AccessLevel.PROTECTED)
@NoArgsConstructor
@Entity
@Table(name= "TEST")
@JsonNaming(value = PropertyNamingStrategy.SnakeCaseStrategy.class)
public class UserEntity{

    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("ID")
    private Long ID;

    @Column(name = "NAME")
    @JsonProperty("NAME")
    private String NAME;
    
    @Column(name = "EMAIL")
    @JsonProperty("EMAIL")
    private String EMAIL;
   
    public UserEntity(Long id2, String name2,String email2)
    {
    	this.ID = id2;
    	this.NAME = name2;
    	this.EMAIL = email2;
    }
    
    public void setID(Long id2)
    {
    	this.ID = id2;
    }
    
	public void setNAME(String name2) {
		// TODO Auto-generated method stub
		this.NAME = name2;
	}
	public void setEMAIL(String email2) {
		// TODO Auto-generated method stub
		this.EMAIL = email2;
	}
    // 생성자, getter, setter
}
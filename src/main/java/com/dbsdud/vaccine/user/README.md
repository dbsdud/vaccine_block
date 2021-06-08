### Api -> Controller
클라이언트에서 요청이 들어올 때, 해당 요청을 수행할 비즈니스 로직을 제어하는 객체입니다.<br/>
컨트롤러에서 세부적으로 서비스 레이어를 만들어 해당 요청사항을 객체 지향적인 방식으로 세분화하여 관리합니다.

### Application -> Service
서비스 레이어단에서 세분화된 비즈니스로직을 처리하는 객체입니다.
### Dao -> Repository
Data Access Object의 줄임말로 DB를 사용해 데이터를 조회하거나 조작하는 기능을 전담하도록 만든 객체입니다.
### Domain
도메인 객체는 해결하고자 하는 핵심 비즈니스 로직이 반영되는 곳입니다.<br/>
### DTO == VO
DTO(Data Transfer Object) 또는 VO(Value Object)로 불리며, <br/>
각 계층간 데이터 교환을 위한 자바 객체를 의미합니다.<br/>
이 객체는 데이터를 각 레이어 간에 전달하는 목적을 가지고 있으며 객체의 속성과 Getter, Setter만 가지고 있습니다. 
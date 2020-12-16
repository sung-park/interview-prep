# 인터뷰 준비
  
## 일반

### Design Pattern
* Software design pattern : https://en.wikipedia.org/wiki/Software_design_pattern
  * design pattern known problem에 대한 문서화되고 검증된 해결책
  * 서로 커뮤니케이션에 용이하다
  * Classification and list
    * Creational patterns
      1. Abstract factory : https://en.wikipedia.org/wiki/Abstract_factory_pattern
      1. Builder pattern : https://en.wikipedia.org/wiki/Builder_pattern
      1. Singleton pattern : https://en.wikipedia.org/wiki/Singleton_pattern
      1. Prototype pattern : https://en.wikipedia.org/wiki/Prototype_pattern
    * Structural patterns
    * Behavioural patterns
    * Concurrency patterns 
    
### Software Architecture


## Android

### Design Pattern

### Architecture

* Android Application Architecture (Android Dev Summit 2015) : https://www.youtube.com/watch?v=BlkJzgjzL0c
  * Architecture는 User Experience에 영향을 미친다. 초반에 적용하는게 영향성이 가장 적다.
  * View - View Controller - Persistent Model - Application Logic - Network (Design for offline)
  * Background Process도 Local과 Network 연결 포함하는 Global Sync 스레드 분리 (Task Queue) 
* Build a modular Android app architecture (Google I/O'19) : https://www.youtube.com/watch?v=PZBg5DIzNww
  * module : library module, dynamic feature module
  * module by feature, module by layer


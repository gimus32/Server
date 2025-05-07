databaseChangeLog:
  - - changeSet:
        id: 7
        author: user
        changes:
          - createType:
              catalogName: public
              typeName: passport_enum
              values:
                - RUSSIAN
                - AMERICAN
                - GERMAN
                - FRENCH
                - JAPANESE
                - CHINESE
                - INDIAN
                - BRAZILIAN
                - CANADIAN
                - AUSTRALIAN
                - changeSet:
                    id: 9
                    author: user
                    changes:
                      - insert:
                          tableName: users1
                          columns:
                            - column: { name: user_id, valueNumeric: 1 }
                            - column: { name: passport, value: RUSSIAN }
                      - insert:
                          tableName: users1
                          columns:
                            - column: { name: user_id, valueNumeric: 1 }
                            - column: { name: passport, value: GERMAN }
                      - insert:
                          tableName: users1
                          columns:
                            - column: { name: user_id, valueNumeric: 3 }
                            - column: { name: passport, value: AMERICAN }
                      - insert:
                          tableName: users1
                          columns:
                            - column: { name: user_id, valueNumeric: 2 }
                            - column: { name: passport, value: CHINESE }
                      - insert:
                          tableName: users1
                          columns:
                            - column: { name: user_id, valueNumeric: 3 }
                            - column: { name: passport, value: FRENCH }
                      - insert:
                          tableName: users1
                          columns:
                            - column: { name: user_id, valueNumeric: 4 }
                            - column: { name: passport, value: JAPANESE }
                      - insert:
                          tableName: users1
                          columns:
                            - column: { name: user_id, valueNumeric: 4 }
                            - column: { name: passport, value: CANADIAN }
                      - insert:
                          tableName: users1
                          columns:
                            - column: { name: user_id, valueNumeric: 2 }
                            - column: { name: passport, value: BRAZILIAN }
                      - insert:
                          tableName: users1
                          columns:
                            - column: { name: user_id, valueNumeric: 1 }
                            - column: { name: passport, value: INDIAN }
                      - insert:
                          tableName: users1
                          columns:
                            - column: { name: user_id, valueNumeric: 2 }
                            - column: { name: passport, value: AUSTRALIAN }
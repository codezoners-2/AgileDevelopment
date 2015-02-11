(render :theme :sky
        :title "Introduction to Agile Development"
        :author "Nick Rothwell"

        :slides [[:section
                  (heading "Agile 101")
                  (subheading "Nick Rothwell")]

                 [:section
                  [:section
                   (heading "The Software Crisis")

                   (image-h 300 "softwarecrisis.jpg")
                   ]
                  ;;...

                  [:section
                   (heading "Failed and Overbudget Projects")

                   (link "http://en.wikipedia.org/wiki/List_of_failed_and_overbudget_custom_software_projects")]

                  [:section
                   (image "business-plan-2007-05-14.png")]]

                 [:section
                  [:section
                   (heading "Waterfall Model")
                   (subheading "(1956)")

                   (image-h 350 "800px-Waterfall_model.svg.png")

                   [:ul [:li "(Influenced by manufacturing and construction)"]]]

                  [:section
                   (subheading "But...")

                   [:ul
                    [:li "Requirements change"]
                    [:li "Implementation is unknown"]]]]

                 [:section
                  [:section
                   (heading "Agile Development")

                   (image "agile-model.png")

                   ]

                  [:section
                   [:ul
                    [:li "Iterative, incremental and evolutionary"]
                    [:li "Efficient and face-to-face communication"]
                    [:li "Very short feedback loop and adaptation cycle"]
                    [:li "Adaptive vs. predictive"]
                    ;; Can only be adaptive if constantly testing
                    ]]

                  [:section
                   (subheading "Agile Practices")

                   [:ul
                    [:li "Pair Programming"]
                    [:li "Test-Driven Development"]
                    [:li "Continuous Integration"]
                    [:li "Scrum Meetings"]
                    [:li "Sprint Cycles"]
                    [:li "Planning Poker"]
                    [:li "Refactoring"]
                    [:li "User Stories"]
                    [:li "..."]]
                   ]

                  [:section
                   (subheading "Pair Programming")

                   (image "Pair_programming_1.jpg")

                   [:p "1 &#x00D7; Driver, 1 &#x00D7; Navigator"]

                   ]

                  [:section
                   (subheading "Test-Driven Development")

                   (image "Test-driven_development.PNG")

                   [:p "Develop code by writing tests"]]

                  [:section
                   (subheading "Types of Test")

                   [:ul
                    [:li "Unit Tests"]
                    [:li "Integration Tests"]
                    [:li "Visual Tests"]
                    [:li "GUI Tests"]
                    [:li "System (End-to-End) Tests"]
                    [:li "Acceptance Tests"]
                    [:li "Installation Tests"]
                    [:li "..."]
                    [:li "Regression Testing"]]
                   ]

                  [:section
                   (subheading "Build a Test Suite")

                   [:ul
                    [:li "(Growing) collection of test cases"]
                    [:li "View the tests as specification"]
                    [:li "Writing the tests: debugging investment up front"]]]

                  [:section
                   (subheading "Write the Tests First!")]

                  [:section {:data-background "#FF8080"}
                   (heading "Write the Tests First!")]]

                 [:section
                  [:section
                   (heading "Python: Documentation Strings")

                   (include-code "adder.py")

                   (include-code "adder.__doc__.py")]

                  [:section
                   (heading "DocTest")
                   (subheading "Testing with Documentation Strings")

                   (include-code "adder-test.py")

                   [:p "Sections starting with " (tt ">>>") " are tested"]

                   (include-code "import-doctest.py")]]

                 [:section
                  [:section
                   (heading "Exercise 1: FixMe")

                   [:ul
                    [:li (tt "fixme-1.py") ": some broken functions which need fixing"]
                    [:li (tt "fixme-tricky.py") ": a single, harder example"]]

                   ;; LINK: XXXX
                   ]]

                 ;; -- HERE --

                 [:section
                  [:section
                   (heading "Exercise 2: ....")
                   ;; buggy code, but the tests actually work. Pairing: first person
                   ;; adds a test to cause a failure, second person fixes the code, swap round.
                   ]]

                 [:section
                  [:section
                   (heading "Exercise 3: ....")
                   ;; Given stub functions and a spec. (i) implement tests for that spec,
                   ;; (ii) implement code. Multiple stages.
                   ;;
                   ]]



                 ;; ---
                 ;; Technologies:
                 ;; unit testing (doctest, QUnit, jUnit, ...)
                 ;; integration testing (Jasmine + web)

                 ;; ---
                 ;; (Want to get to agile process, including incremental dev. and refactoring.)
                 ;; TDD: write the tests first.
                 ;; Tests as specification. Start with void implementation.

                 ;; ---
                 ;; Exercises:
                 ;; Given a spec., design tests to express it.
                 ;; Implement code to match the tests.

                 ;; ---
                 ;; Refactoring: improving code structure without changing functionality.

                 ;; ---
                 ;; Exercises for refactoring:
                 ;; (Provide code which works but is untidy.) Refactor (with guidelines).
                 ])

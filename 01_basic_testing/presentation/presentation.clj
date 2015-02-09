(render :theme :sky
        :title "Introduction to Agile Development"
        :author "Nick Rothwell"

        :slides [[:section
                  (heading "Agile 101")
                  (subheading "Nick Rothwell")]

                 ;; ---
                 ;; Agile: introduction. Compare with Waterfall etc.
                 ;; Key aspects: TDD, pairing, sprints, ... (we're already doing pairing)

                 ;; ---
                 ;; Testing:
                 ;; unit tests, integration, functionality, ...

                 ;; ---
                 ;; Technologies:
                 ;; unit testing (doctest, QUnit, jUnit, ...)
                 ;; integration testing (Jasmine + web)

                 ;; ---
                 ;; Intro: TDD and unit testing
                 ;; (Write the tests first, etc.)

                 ;; ---
                 ;; Tests in Python with doctest

                 ;; ---
                 ;; Exercises
                 ;; i. Given some broken code (tests fail), fix the code to pass the tests.
                 ;; ii. Given some missing code, make the tests pass (need to document requirements).
                 ;; iii. Given some working code, implement some tests (i.e. spec. out the behaviour).
                 ;; iv. Given some broken code, implement tests to show the bug, *then* fix the code.
                 ;; v. Given some (documented) code with tests which pass, add new tests to show
                 ;; bugs, and fix code.

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

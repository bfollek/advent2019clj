# advent2019clj

Advent of Code 2019 in clojure.

#### Day 1

In my first version of Part 2, I used loop/recur in *(fuel-required-meta)*. Whenever I drop back into clojure, it takes me a while to shuck the imperative mindset. Eventually I remembered (iterate), and a simpler, more functional solution IMO.

## License

Copyright © 2019 Bob Follek

This program and the accompanying materials are made available under the
terms of the Eclipse Public License 2.0 which is available at
http://www.eclipse.org/legal/epl-2.0.

This Source Code may also be made available under the following Secondary
Licenses when the conditions for such availability set forth in the Eclipse
Public License, v. 2.0 are satisfied: GNU General Public License as published by
the Free Software Foundation, either version 2 of the License, or (at your
option) any later version, with the GNU Classpath Exception which is available
at https://www.gnu.org/software/classpath/license.html.

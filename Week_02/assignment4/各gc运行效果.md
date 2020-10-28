1. 串行gc
```
[root@0a6ef877d5fa mnt]# java -XX:+UseSerialGC -Xms512m -Xmx512m -XX:+PrintGCDetails GCLogAnalysis
[0.005s][warning][gc] -XX:+PrintGCDetails is deprecated. Will use -Xlog:gc* instead.
[0.013s][info   ][gc] Using Serial
[0.015s][info   ][gc,init] Version: 15.0.1+9-18 (release)
[0.015s][info   ][gc,init] CPUs: 4 total, 4 available
[0.015s][info   ][gc,init] Memory: 1991M
[0.015s][info   ][gc,init] Large Page Support: Disabled
[0.015s][info   ][gc,init] NUMA Support: Disabled
[0.015s][info   ][gc,init] Compressed Oops: Enabled (32-bit)
[0.015s][info   ][gc,init] Heap Min Capacity: 512M
[0.015s][info   ][gc,init] Heap Initial Capacity: 512M
[0.015s][info   ][gc,init] Heap Max Capacity: 512M
[0.015s][info   ][gc,init] Pre-touch: Disabled
[0.017s][info   ][gc,metaspace] CDS archive(s) mapped at: [0x0000000800000000-0x0000000800b35000-0x0000000800b35000), size 11751424, SharedBaseAddress: 0x0000000800000000, ArchiveRelocationMode: 0.
[0.017s][info   ][gc,metaspace] Compressed class space mapped at: 0x0000000800b38000-0x0000000840b38000, size: 1073741824
[0.017s][info   ][gc,metaspace] Narrow klass base: 0x0000000800000000, Narrow klass shift: 3, Narrow klass range: 0x100000000
????...
[0.204s][info   ][gc,start    ] GC(0) Pause Young (Allocation Failure)
[0.224s][info   ][gc,heap     ] GC(0) DefNew: 139776K(157248K)->17471K(157248K) Eden: 139776K(139776K)->0K(139776K) From: 0K(17472K)->17471K(17472K)
[0.224s][info   ][gc,heap     ] GC(0) Tenured: 0K(349568K)->34493K(349568K)
[0.224s][info   ][gc,metaspace] GC(0) Metaspace: 225K(4864K)->225K(4864K) NonClass: 213K(4352K)->213K(4352K) Class: 11K(512K)->11K(512K)
[0.225s][info   ][gc          ] GC(0) Pause Young (Allocation Failure) 136M->50M(494M) 20.112ms
[0.225s][info   ][gc,cpu      ] GC(0) User=0.01s Sys=0.02s Real=0.02s
[0.246s][info   ][gc,start    ] GC(1) Pause Young (Allocation Failure)
[0.273s][info   ][gc,heap     ] GC(1) DefNew: 157191K(157248K)->17471K(157248K) Eden: 139719K(139776K)->0K(139776K) From: 17471K(17472K)->17471K(17472K)
[0.273s][info   ][gc,heap     ] GC(1) Tenured: 34493K(349568K)->86340K(349568K)
[0.273s][info   ][gc,metaspace] GC(1) Metaspace: 225K(4864K)->225K(4864K) NonClass: 213K(4352K)->213K(4352K) Class: 11K(512K)->11K(512K)
[0.273s][info   ][gc          ] GC(1) Pause Young (Allocation Failure) 187M->101M(494M) 27.117ms
[0.273s][info   ][gc,cpu      ] GC(1) User=0.01s Sys=0.01s Real=0.03s
[0.293s][info   ][gc,start    ] GC(2) Pause Young (Allocation Failure)
[0.314s][info   ][gc,heap     ] GC(2) DefNew: 157115K(157248K)->17470K(157248K) Eden: 139643K(139776K)->0K(139776K) From: 17471K(17472K)->17470K(17472K)
[0.314s][info   ][gc,heap     ] GC(2) Tenured: 86340K(349568K)->134138K(349568K)
[0.314s][info   ][gc,metaspace] GC(2) Metaspace: 225K(4864K)->225K(4864K) NonClass: 213K(4352K)->213K(4352K) Class: 11K(512K)->11K(512K)
[0.314s][info   ][gc          ] GC(2) Pause Young (Allocation Failure) 237M->148M(494M) 20.243ms
[0.314s][info   ][gc,cpu      ] GC(2) User=0.01s Sys=0.01s Real=0.02s
[0.335s][info   ][gc,start    ] GC(3) Pause Young (Allocation Failure)
[0.361s][info   ][gc,heap     ] GC(3) DefNew: 157246K(157248K)->17471K(157248K) Eden: 139776K(139776K)->0K(139776K) From: 17470K(17472K)->17471K(17472K)
[0.361s][info   ][gc,heap     ] GC(3) Tenured: 134138K(349568K)->186657K(349568K)
[0.362s][info   ][gc,metaspace] GC(3) Metaspace: 225K(4864K)->225K(4864K) NonClass: 213K(4352K)->213K(4352K) Class: 11K(512K)->11K(512K)
[0.362s][info   ][gc          ] GC(3) Pause Young (Allocation Failure) 284M->199M(494M) 26.225ms
[0.362s][info   ][gc,cpu      ] GC(3) User=0.01s Sys=0.01s Real=0.02s
[0.383s][info   ][gc,start    ] GC(4) Pause Young (Allocation Failure)
[0.404s][info   ][gc,heap     ] GC(4) DefNew: 157247K(157248K)->17470K(157248K) Eden: 139776K(139776K)->0K(139776K) From: 17471K(17472K)->17470K(17472K)
[0.404s][info   ][gc,heap     ] GC(4) Tenured: 186657K(349568K)->240117K(349568K)
[0.404s][info   ][gc,metaspace] GC(4) Metaspace: 225K(4864K)->225K(4864K) NonClass: 213K(4352K)->213K(4352K) Class: 11K(512K)->11K(512K)
[0.404s][info   ][gc          ] GC(4) Pause Young (Allocation Failure) 335M->251M(494M) 21.546ms
[0.404s][info   ][gc,cpu      ] GC(4) User=0.01s Sys=0.01s Real=0.02s
[0.428s][info   ][gc,start    ] GC(5) Pause Young (Allocation Failure)
[0.448s][info   ][gc,heap     ] GC(5) DefNew: 157246K(157248K)->17471K(157248K) Eden: 139776K(139776K)->0K(139776K) From: 17470K(17472K)->17471K(17472K)
[0.448s][info   ][gc,heap     ] GC(5) Tenured: 240117K(349568K)->288881K(349568K)
[0.448s][info   ][gc,metaspace] GC(5) Metaspace: 225K(4864K)->225K(4864K) NonClass: 213K(4352K)->213K(4352K) Class: 11K(512K)->11K(512K)
[0.449s][info   ][gc          ] GC(5) Pause Young (Allocation Failure) 388M->299M(494M) 20.612ms
[0.449s][info   ][gc,cpu      ] GC(5) User=0.01s Sys=0.02s Real=0.02s
[0.468s][info   ][gc,start    ] GC(6) Pause Young (Allocation Failure)
[0.489s][info   ][gc,heap     ] GC(6) DefNew: 157247K(157248K)->17471K(157248K) Eden: 139776K(139776K)->0K(139776K) From: 17471K(17472K)->17471K(17472K)
[0.489s][info   ][gc,heap     ] GC(6) Tenured: 288881K(349568K)->338508K(349568K)
[0.489s][info   ][gc,metaspace] GC(6) Metaspace: 225K(4864K)->225K(4864K) NonClass: 213K(4352K)->213K(4352K) Class: 11K(512K)->11K(512K)
[0.489s][info   ][gc          ] GC(6) Pause Young (Allocation Failure) 435M->347M(494M) 20.700ms
[0.489s][info   ][gc,cpu      ] GC(6) User=0.01s Sys=0.01s Real=0.02s
[0.511s][info   ][gc,start    ] GC(7) Pause Young (Allocation Failure)
[0.512s][info   ][gc          ] GC(7) Pause Young (Allocation Failure) 484M->484M(494M) 0.276ms
[0.512s][info   ][gc,cpu      ] GC(7) User=0.00s Sys=0.00s Real=0.00s
[0.512s][info   ][gc,start    ] GC(8) Pause Full (Allocation Failure)
[0.512s][info   ][gc,phases,start] GC(8) Phase 1: Mark live objects
[0.514s][info   ][gc,phases      ] GC(8) Phase 1: Mark live objects 2.088ms
[0.514s][info   ][gc,phases,start] GC(8) Phase 2: Compute new object addresses
[0.515s][info   ][gc,phases      ] GC(8) Phase 2: Compute new object addresses 1.305ms
[0.515s][info   ][gc,phases,start] GC(8) Phase 3: Adjust pointers
[0.516s][info   ][gc,phases      ] GC(8) Phase 3: Adjust pointers 1.024ms
[0.516s][info   ][gc,phases,start] GC(8) Phase 4: Move objects
[0.534s][info   ][gc,phases      ] GC(8) Phase 4: Move objects 17.725ms
[0.534s][info   ][gc,heap        ] GC(8) DefNew: 157247K(157248K)->0K(157248K) Eden: 139776K(139776K)->0K(139776K) From: 17471K(17472K)->0K(17472K)
[0.535s][info   ][gc,heap        ] GC(8) Tenured: 338508K(349568K)->270246K(349568K)
[0.535s][info   ][gc,metaspace   ] GC(8) Metaspace: 225K(4864K)->225K(4864K) NonClass: 213K(4352K)->213K(4352K) Class: 11K(512K)->11K(512K)
[0.535s][info   ][gc             ] GC(8) Pause Full (Allocation Failure) 484M->263M(494M) 22.984ms
[0.535s][info   ][gc,cpu         ] GC(8) User=0.02s Sys=0.00s Real=0.03s
[0.556s][info   ][gc,start       ] GC(9) Pause Young (Allocation Failure)
[0.562s][info   ][gc,heap        ] GC(9) DefNew: 139776K(157248K)->17471K(157248K) Eden: 139776K(139776K)->0K(139776K) From: 0K(17472K)->17471K(17472K)
[0.562s][info   ][gc,heap        ] GC(9) Tenured: 270246K(349568K)->309100K(349568K)
[0.562s][info   ][gc,metaspace   ] GC(9) Metaspace: 225K(4864K)->225K(4864K) NonClass: 213K(4352K)->213K(4352K) Class: 11K(512K)->11K(512K)
[0.562s][info   ][gc             ] GC(9) Pause Young (Allocation Failure) 400M->318M(494M) 5.653ms
[0.562s][info   ][gc,cpu         ] GC(9) User=0.00s Sys=0.00s Real=0.00s
[0.581s][info   ][gc,start       ] GC(10) Pause Young (Allocation Failure)
[0.581s][info   ][gc             ] GC(10) Pause Young (Allocation Failure) 455M->455M(494M) 0.180ms
[0.581s][info   ][gc,cpu         ] GC(10) User=0.00s Sys=0.00s Real=0.00s
[0.581s][info   ][gc,start       ] GC(11) Pause Full (Allocation Failure)
[0.581s][info   ][gc,phases,start] GC(11) Phase 1: Mark live objects
[0.582s][info   ][gc,phases      ] GC(11) Phase 1: Mark live objects 1.182ms
[0.582s][info   ][gc,phases,start] GC(11) Phase 2: Compute new object addresses
[0.583s][info   ][gc,phases      ] GC(11) Phase 2: Compute new object addresses 0.959ms
[0.583s][info   ][gc,phases,start] GC(11) Phase 3: Adjust pointers
[0.584s][info   ][gc,phases      ] GC(11) Phase 3: Adjust pointers 0.778ms
[0.584s][info   ][gc,phases,start] GC(11) Phase 4: Move objects
[0.605s][info   ][gc,phases      ] GC(11) Phase 4: Move objects 20.730ms
[0.605s][info   ][gc,heap        ] GC(11) DefNew: 157247K(157248K)->0K(157248K) Eden: 139776K(139776K)->0K(139776K) From: 17471K(17472K)->0K(17472K)
[0.605s][info   ][gc,heap        ] GC(11) Tenured: 309100K(349568K)->299904K(349568K)
[0.605s][info   ][gc,metaspace   ] GC(11) Metaspace: 225K(4864K)->225K(4864K) NonClass: 213K(4352K)->213K(4352K) Class: 11K(512K)->11K(512K)
[0.605s][info   ][gc             ] GC(11) Pause Full (Allocation Failure) 455M->292M(494M) 24.327ms
[0.605s][info   ][gc,cpu         ] GC(11) User=0.03s Sys=0.00s Real=0.03s
[0.627s][info   ][gc,start       ] GC(12) Pause Young (Allocation Failure)
[0.631s][info   ][gc,heap        ] GC(12) DefNew: 139756K(157248K)->17471K(157248K) Eden: 139756K(139776K)->0K(139776K) From: 0K(17472K)->17471K(17472K)
[0.631s][info   ][gc,heap        ] GC(12) Tenured: 299904K(349568K)->330652K(349568K)
[0.631s][info   ][gc,metaspace   ] GC(12) Metaspace: 225K(4864K)->225K(4864K) NonClass: 213K(4352K)->213K(4352K) Class: 11K(512K)->11K(512K)
[0.631s][info   ][gc             ] GC(12) Pause Young (Allocation Failure) 429M->339M(494M) 4.840ms
[0.631s][info   ][gc,cpu         ] GC(12) User=0.01s Sys=0.01s Real=0.00s
[0.651s][info   ][gc,start       ] GC(13) Pause Young (Allocation Failure)
[0.652s][info   ][gc             ] GC(13) Pause Young (Allocation Failure) 476M->476M(494M) 0.343ms
[0.652s][info   ][gc,cpu         ] GC(13) User=0.00s Sys=0.00s Real=0.00s
[0.652s][info   ][gc,start       ] GC(14) Pause Full (Allocation Failure)
[0.652s][info   ][gc,phases,start] GC(14) Phase 1: Mark live objects
[0.653s][info   ][gc,phases      ] GC(14) Phase 1: Mark live objects 1.364ms
[0.653s][info   ][gc,phases,start] GC(14) Phase 2: Compute new object addresses
[0.655s][info   ][gc,phases      ] GC(14) Phase 2: Compute new object addresses 1.121ms
[0.655s][info   ][gc,phases,start] GC(14) Phase 3: Adjust pointers
[0.656s][info   ][gc,phases      ] GC(14) Phase 3: Adjust pointers 0.997ms
[0.656s][info   ][gc,phases,start] GC(14) Phase 4: Move objects
[0.678s][info   ][gc,phases      ] GC(14) Phase 4: Move objects 22.073ms
[0.678s][info   ][gc,heap        ] GC(14) DefNew: 157247K(157248K)->0K(157248K) Eden: 139776K(139776K)->0K(139776K) From: 17471K(17472K)->0K(17472K)
[0.678s][info   ][gc,heap        ] GC(14) Tenured: 330652K(349568K)->318042K(349568K)
[0.678s][info   ][gc,metaspace   ] GC(14) Metaspace: 225K(4864K)->225K(4864K) NonClass: 213K(4352K)->213K(4352K) Class: 11K(512K)->11K(512K)
[0.678s][info   ][gc             ] GC(14) Pause Full (Allocation Failure) 476M->310M(494M) 26.285ms
[0.678s][info   ][gc,cpu         ] GC(14) User=0.03s Sys=0.00s Real=0.03s
[0.697s][info   ][gc,start       ] GC(15) Pause Young (Allocation Failure)
[0.697s][info   ][gc             ] GC(15) Pause Young (Allocation Failure) 447M->447M(494M) 0.549ms
[0.698s][info   ][gc,cpu         ] GC(15) User=0.00s Sys=0.00s Real=0.00s
[0.698s][info   ][gc,start       ] GC(16) Pause Full (Allocation Failure)
[0.698s][info   ][gc,phases,start] GC(16) Phase 1: Mark live objects
[0.699s][info   ][gc,phases      ] GC(16) Phase 1: Mark live objects 1.217ms
[0.699s][info   ][gc,phases,start] GC(16) Phase 2: Compute new object addresses
[0.700s][info   ][gc,phases      ] GC(16) Phase 2: Compute new object addresses 0.990ms
[0.700s][info   ][gc,phases,start] GC(16) Phase 3: Adjust pointers
[0.701s][info   ][gc,phases      ] GC(16) Phase 3: Adjust pointers 0.949ms
[0.701s][info   ][gc,phases,start] GC(16) Phase 4: Move objects
[0.723s][info   ][gc,phases      ] GC(16) Phase 4: Move objects 22.176ms
[0.724s][info   ][gc,heap        ] GC(16) DefNew: 139776K(157248K)->0K(157248K) Eden: 139776K(139776K)->0K(139776K) From: 0K(17472K)->0K(17472K)
[0.724s][info   ][gc,heap        ] GC(16) Tenured: 318042K(349568K)->309319K(349568K)
[0.724s][info   ][gc,metaspace   ] GC(16) Metaspace: 225K(4864K)->225K(4864K) NonClass: 213K(4352K)->213K(4352K) Class: 11K(512K)->11K(512K)
[0.724s][info   ][gc             ] GC(16) Pause Full (Allocation Failure) 447M->302M(494M) 26.131ms
[0.724s][info   ][gc,cpu         ] GC(16) User=0.03s Sys=0.00s Real=0.03s
[0.742s][info   ][gc,start       ] GC(17) Pause Young (Allocation Failure)
[0.742s][info   ][gc             ] GC(17) Pause Young (Allocation Failure) 438M->438M(494M) 0.365ms
[0.742s][info   ][gc,cpu         ] GC(17) User=0.00s Sys=0.00s Real=0.01s
[0.742s][info   ][gc,start       ] GC(18) Pause Full (Allocation Failure)
[0.742s][info   ][gc,phases,start] GC(18) Phase 1: Mark live objects
[0.744s][info   ][gc,phases      ] GC(18) Phase 1: Mark live objects 1.201ms
[0.744s][info   ][gc,phases,start] GC(18) Phase 2: Compute new object addresses
[0.745s][info   ][gc,phases      ] GC(18) Phase 2: Compute new object addresses 1.198ms
[0.745s][info   ][gc,phases,start] GC(18) Phase 3: Adjust pointers
[0.746s][info   ][gc,phases      ] GC(18) Phase 3: Adjust pointers 1.149ms
[0.746s][info   ][gc,phases,start] GC(18) Phase 4: Move objects
[0.763s][info   ][gc,phases      ] GC(18) Phase 4: Move objects 17.081ms
[0.764s][info   ][gc,heap        ] GC(18) DefNew: 139776K(157248K)->0K(157248K) Eden: 139776K(139776K)->0K(139776K) From: 0K(17472K)->0K(17472K)
[0.764s][info   ][gc,heap        ] GC(18) Tenured: 309319K(349568K)->338645K(349568K)
[0.764s][info   ][gc,metaspace   ] GC(18) Metaspace: 225K(4864K)->225K(4864K) NonClass: 213K(4352K)->213K(4352K) Class: 11K(512K)->11K(512K)
[0.764s][info   ][gc             ] GC(18) Pause Full (Allocation Failure) 438M->330M(494M) 21.534ms
[0.764s][info   ][gc,cpu         ] GC(18) User=0.02s Sys=0.00s Real=0.02s
[0.785s][info   ][gc,start       ] GC(19) Pause Young (Allocation Failure)
[0.785s][info   ][gc             ] GC(19) Pause Young (Allocation Failure) 466M->466M(494M) 0.550ms
[0.785s][info   ][gc,cpu         ] GC(19) User=0.00s Sys=0.00s Real=0.00s
[0.785s][info   ][gc,start       ] GC(20) Pause Full (Allocation Failure)
[0.786s][info   ][gc,phases,start] GC(20) Phase 1: Mark live objects
[0.787s][info   ][gc,phases      ] GC(20) Phase 1: Mark live objects 1.311ms
[0.787s][info   ][gc,phases,start] GC(20) Phase 2: Compute new object addresses
[0.788s][info   ][gc,phases      ] GC(20) Phase 2: Compute new object addresses 1.037ms
[0.788s][info   ][gc,phases,start] GC(20) Phase 3: Adjust pointers
[0.789s][info   ][gc,phases      ] GC(20) Phase 3: Adjust pointers 1.054ms
[0.789s][info   ][gc,phases,start] GC(20) Phase 4: Move objects
[0.813s][info   ][gc,phases      ] GC(20) Phase 4: Move objects 23.199ms
[0.813s][info   ][gc,heap        ] GC(20) DefNew: 139201K(157248K)->0K(157248K) Eden: 139201K(139776K)->0K(139776K) From: 0K(17472K)->0K(17472K)
[0.813s][info   ][gc,heap        ] GC(20) Tenured: 338645K(349568K)->345579K(349568K)
[0.813s][info   ][gc,metaspace   ] GC(20) Metaspace: 225K(4864K)->225K(4864K) NonClass: 213K(4352K)->213K(4352K) Class: 11K(512K)->11K(512K)
[0.813s][info   ][gc             ] GC(20) Pause Full (Allocation Failure) 466M->337M(494M) 27.461ms
[0.813s][info   ][gc,cpu         ] GC(20) User=0.03s Sys=0.00s Real=0.03s
[0.834s][info   ][gc,start       ] GC(21) Pause Young (Allocation Failure)
[0.834s][info   ][gc             ] GC(21) Pause Young (Allocation Failure) 473M->473M(494M) 0.169ms
[0.834s][info   ][gc,cpu         ] GC(21) User=0.00s Sys=0.00s Real=0.00s
[0.834s][info   ][gc,start       ] GC(22) Pause Full (Allocation Failure)
[0.834s][info   ][gc,phases,start] GC(22) Phase 1: Mark live objects
[0.835s][info   ][gc,phases      ] GC(22) Phase 1: Mark live objects 1.310ms
[0.835s][info   ][gc,phases,start] GC(22) Phase 2: Compute new object addresses
[0.836s][info   ][gc,phases      ] GC(22) Phase 2: Compute new object addresses 0.955ms
[0.836s][info   ][gc,phases,start] GC(22) Phase 3: Adjust pointers
[0.837s][info   ][gc,phases      ] GC(22) Phase 3: Adjust pointers 0.893ms
[0.837s][info   ][gc,phases,start] GC(22) Phase 4: Move objects
[0.860s][info   ][gc,phases      ] GC(22) Phase 4: Move objects 22.473ms
[0.860s][info   ][gc,heap        ] GC(22) DefNew: 139776K(157248K)->597K(157248K) Eden: 139776K(139776K)->597K(139776K) From: 0K(17472K)->0K(17472K)
[0.860s][info   ][gc,heap        ] GC(22) Tenured: 345579K(349568K)->349565K(349568K)
[0.860s][info   ][gc,metaspace   ] GC(22) Metaspace: 225K(4864K)->225K(4864K) NonClass: 213K(4352K)->213K(4352K) Class: 11K(512K)->11K(512K)
[0.860s][info   ][gc             ] GC(22) Pause Full (Allocation Failure) 473M->341M(494M) 26.155ms
[0.860s][info   ][gc,cpu         ] GC(22) User=0.03s Sys=0.00s Real=0.02s
[0.882s][info   ][gc,start       ] GC(23) Pause Full (Allocation Failure)
[0.882s][info   ][gc,phases,start] GC(23) Phase 1: Mark live objects
[0.883s][info   ][gc,phases      ] GC(23) Phase 1: Mark live objects 1.246ms
[0.883s][info   ][gc,phases,start] GC(23) Phase 2: Compute new object addresses
[0.885s][info   ][gc,phases      ] GC(23) Phase 2: Compute new object addresses 1.196ms
[0.885s][info   ][gc,phases,start] GC(23) Phase 3: Adjust pointers
[0.886s][info   ][gc,phases      ] GC(23) Phase 3: Adjust pointers 1.025ms
[0.886s][info   ][gc,phases,start] GC(23) Phase 4: Move objects
[0.909s][info   ][gc,phases      ] GC(23) Phase 4: Move objects 23.353ms
[0.909s][info   ][gc,heap        ] GC(23) DefNew: 157236K(157248K)->0K(157248K) Eden: 139776K(139776K)->0K(139776K) From: 17460K(17472K)->0K(17472K)
[0.909s][info   ][gc,heap        ] GC(23) Tenured: 349565K(349568K)->335424K(349568K)
[0.909s][info   ][gc,metaspace   ] GC(23) Metaspace: 225K(4864K)->225K(4864K) NonClass: 213K(4352K)->213K(4352K) Class: 11K(512K)->11K(512K)
[0.909s][info   ][gc             ] GC(23) Pause Full (Allocation Failure) 494M->327M(494M) 27.489ms
[0.909s][info   ][gc,cpu         ] GC(23) User=0.02s Sys=0.00s Real=0.03s
[0.929s][info   ][gc,start       ] GC(24) Pause Young (Allocation Failure)
[0.930s][info   ][gc             ] GC(24) Pause Young (Allocation Failure) 463M->463M(494M) 0.163ms
[0.930s][info   ][gc,cpu         ] GC(24) User=0.00s Sys=0.00s Real=0.00s
[0.930s][info   ][gc,start       ] GC(25) Pause Full (Allocation Failure)
[0.930s][info   ][gc,phases,start] GC(25) Phase 1: Mark live objects
[0.931s][info   ][gc,phases      ] GC(25) Phase 1: Mark live objects 1.639ms
[0.931s][info   ][gc,phases,start] GC(25) Phase 2: Compute new object addresses
[0.932s][info   ][gc,phases      ] GC(25) Phase 2: Compute new object addresses 1.027ms
[0.933s][info   ][gc,phases,start] GC(25) Phase 3: Adjust pointers
[0.933s][info   ][gc,phases      ] GC(25) Phase 3: Adjust pointers 0.935ms
[0.933s][info   ][gc,phases,start] GC(25) Phase 4: Move objects
[0.950s][info   ][gc,phases      ] GC(25) Phase 4: Move objects 16.101ms
[0.950s][info   ][gc,heap        ] GC(25) DefNew: 139415K(157248K)->11026K(157248K) Eden: 139415K(139776K)->11026K(139776K) From: 0K(17472K)->0K(17472K)
[0.950s][info   ][gc,heap        ] GC(25) Tenured: 335424K(349568K)->349558K(349568K)
[0.950s][info   ][gc,metaspace   ] GC(25) Metaspace: 225K(4864K)->225K(4864K) NonClass: 213K(4352K)->213K(4352K) Class: 11K(512K)->11K(512K)
[0.950s][info   ][gc             ] GC(25) Pause Full (Allocation Failure) 463M->352M(494M) 20.307ms
[0.950s][info   ][gc,cpu         ] GC(25) User=0.02s Sys=0.00s Real=0.02s
[0.971s][info   ][gc,start       ] GC(26) Pause Full (Allocation Failure)
[0.971s][info   ][gc,phases,start] GC(26) Phase 1: Mark live objects
[0.972s][info   ][gc,phases      ] GC(26) Phase 1: Mark live objects 1.114ms
[0.972s][info   ][gc,phases,start] GC(26) Phase 2: Compute new object addresses
[0.973s][info   ][gc,phases      ] GC(26) Phase 2: Compute new object addresses 1.166ms
[0.973s][info   ][gc,phases,start] GC(26) Phase 3: Adjust pointers
[0.974s][info   ][gc,phases      ] GC(26) Phase 3: Adjust pointers 0.875ms
[0.974s][info   ][gc,phases,start] GC(26) Phase 4: Move objects
[0.996s][info   ][gc,phases      ] GC(26) Phase 4: Move objects 21.958ms
[0.996s][info   ][gc,heap        ] GC(26) DefNew: 157083K(157248K)->10544K(157248K) Eden: 139776K(139776K)->10544K(139776K) From: 17307K(17472K)->0K(17472K)
[0.997s][info   ][gc,heap        ] GC(26) Tenured: 349558K(349568K)->349501K(349568K)
[0.997s][info   ][gc,metaspace   ] GC(26) Metaspace: 225K(4864K)->225K(4864K) NonClass: 213K(4352K)->213K(4352K) Class: 11K(512K)->11K(512K)
[0.997s][info   ][gc             ] GC(26) Pause Full (Allocation Failure) 494M->351M(494M) 25.785ms
[0.997s][info   ][gc,cpu         ] GC(26) User=0.03s Sys=0.00s Real=0.03s
[1.018s][info   ][gc,start       ] GC(27) Pause Full (Allocation Failure)
[1.018s][info   ][gc,phases,start] GC(27) Phase 1: Mark live objects
[1.019s][info   ][gc,phases      ] GC(27) Phase 1: Mark live objects 1.310ms
[1.019s][info   ][gc,phases,start] GC(27) Phase 2: Compute new object addresses
[1.020s][info   ][gc,phases      ] GC(27) Phase 2: Compute new object addresses 0.953ms
[1.020s][info   ][gc,phases,start] GC(27) Phase 3: Adjust pointers
[1.021s][info   ][gc,phases      ] GC(27) Phase 3: Adjust pointers 0.777ms
[1.021s][info   ][gc,phases,start] GC(27) Phase 4: Move objects
[1.043s][info   ][gc,phases      ] GC(27) Phase 4: Move objects 22.291ms
[1.043s][info   ][gc,heap        ] GC(27) DefNew: 157152K(157248K)->12499K(157248K) Eden: 139776K(139776K)->12499K(139776K) From: 17376K(17472K)->0K(17472K)
[1.043s][info   ][gc,heap        ] GC(27) Tenured: 349501K(349568K)->349341K(349568K)
[1.043s][info   ][gc,metaspace   ] GC(27) Metaspace: 225K(4864K)->225K(4864K) NonClass: 213K(4352K)->213K(4352K) Class: 11K(512K)->11K(512K)
[1.044s][info   ][gc             ] GC(27) Pause Full (Allocation Failure) 494M->353M(494M) 25.984ms
[1.044s][info   ][gc,cpu         ] GC(27) User=0.03s Sys=0.00s Real=0.03s
[1.065s][info   ][gc,start       ] GC(28) Pause Full (Allocation Failure)
[1.065s][info   ][gc,phases,start] GC(28) Phase 1: Mark live objects
[1.066s][info   ][gc,phases      ] GC(28) Phase 1: Mark live objects 1.280ms
[1.066s][info   ][gc,phases,start] GC(28) Phase 2: Compute new object addresses
[1.068s][info   ][gc,phases      ] GC(28) Phase 2: Compute new object addresses 1.124ms
[1.068s][info   ][gc,phases,start] GC(28) Phase 3: Adjust pointers
[1.069s][info   ][gc,phases      ] GC(28) Phase 3: Adjust pointers 1.649ms
[1.069s][info   ][gc,phases,start] GC(28) Phase 4: Move objects
[1.097s][info   ][gc,phases      ] GC(28) Phase 4: Move objects 27.410ms
[1.097s][info   ][gc,heap        ] GC(28) DefNew: 157226K(157248K)->0K(157248K) Eden: 139776K(139776K)->0K(139776K) From: 17450K(17472K)->0K(17472K)
[1.097s][info   ][gc,heap        ] GC(28) Tenured: 349437K(349568K)->345621K(349568K)
[1.097s][info   ][gc,metaspace   ] GC(28) Metaspace: 225K(4864K)->225K(4864K) NonClass: 213K(4352K)->213K(4352K) Class: 11K(512K)->11K(512K)
[1.097s][info   ][gc             ] GC(28) Pause Full (Allocation Failure) 494M->337M(494M) 31.993ms
[1.097s][info   ][gc,cpu         ] GC(28) User=0.02s Sys=0.00s Real=0.03s
????????????: 13930
[1.121s][info   ][gc,heap,exit   ] Heap
[1.121s][info   ][gc,heap,exit   ]  def new generation   total 157248K, used 15614K [0x00000000e0000000, 0x00000000eaaa0000, 0x00000000eaaa0000)
[1.121s][info   ][gc,heap,exit   ]   eden space 139776K,  11% used [0x00000000e0000000, 0x00000000e0f3fb88, 0x00000000e8880000)
[1.121s][info   ][gc,heap,exit   ]   from space 17472K,   0% used [0x00000000e9990000, 0x00000000e9990000, 0x00000000eaaa0000)
[1.121s][info   ][gc,heap,exit   ]   to   space 17472K,   0% used [0x00000000e8880000, 0x00000000e8880000, 0x00000000e9990000)
[1.121s][info   ][gc,heap,exit   ]  tenured generation   total 349568K, used 345621K [0x00000000eaaa0000, 0x0000000100000000, 0x0000000100000000)
[1.121s][info   ][gc,heap,exit   ]    the space 349568K,  98% used [0x00000000eaaa0000, 0x00000000ffc25508, 0x00000000ffc25600, 0x0000000100000000)
[1.121s][info   ][gc,heap,exit   ]  Metaspace       used 345K, capacity 4508K, committed 4864K, reserved 1056768K
[1.121s][info   ][gc,heap,exit   ]   class space    used 25K, capacity 392K, committed 512K, reserved 1048576K
[root@0a6ef877d5fa mnt]# 
```
在设置最大堆内存512m情况下，产生29次gc，`Pause Young`标识young gc，`Pause Full`标识full gc，过程更为复杂，包含标记，移动操作

2.  并行gc
```
[root@0a6ef877d5fa mnt]# java -XX:+UseParallelGC -Xms512m -Xmx512m -XX:+PrintGCDetails GCLogAnalysis
[0.005s][warning][gc] -XX:+PrintGCDetails is deprecated. Will use -Xlog:gc* instead.
[0.012s][info   ][gc] Using Parallel
[0.015s][info   ][gc,init] Version: 15.0.1+9-18 (release)
[0.015s][info   ][gc,init] CPUs: 4 total, 4 available
[0.015s][info   ][gc,init] Memory: 1991M
[0.015s][info   ][gc,init] Large Page Support: Disabled
[0.015s][info   ][gc,init] NUMA Support: Disabled
[0.015s][info   ][gc,init] Compressed Oops: Enabled (32-bit)
[0.015s][info   ][gc,init] Heap Min Capacity: 512M
[0.015s][info   ][gc,init] Heap Initial Capacity: 512M
[0.015s][info   ][gc,init] Heap Max Capacity: 512M
[0.015s][info   ][gc,init] Pre-touch: Disabled
[0.015s][info   ][gc,init] Parallel Workers: 4
[0.017s][info   ][gc,metaspace] CDS archive(s) mapped at: [0x0000000800000000-0x0000000800b35000-0x0000000800b35000), size 11751424, SharedBaseAddress: 0x0000000800000000, ArchiveRelocationMode: 0.
[0.017s][info   ][gc,metaspace] Compressed class space mapped at: 0x0000000800b38000-0x0000000840b38000, size: 1073741824
[0.017s][info   ][gc,metaspace] Narrow klass base: 0x0000000800000000, Narrow klass shift: 3, Narrow klass range: 0x100000000
????...
[0.195s][info   ][gc,start    ] GC(0) Pause Young (Allocation Failure)
[0.203s][info   ][gc,heap     ] GC(0) PSYoungGen: 131584K(153088K)->21499K(153088K) Eden: 131584K(131584K)->0K(131584K) From: 0K(21504K)->21499K(21504K)
[0.203s][info   ][gc,heap     ] GC(0) ParOldGen: 0K(349696K)->27997K(349696K)
[0.203s][info   ][gc,metaspace] GC(0) Metaspace: 223K(4864K)->223K(4864K) NonClass: 212K(4352K)->212K(4352K) Class: 11K(512K)->11K(512K)
[0.203s][info   ][gc          ] GC(0) Pause Young (Allocation Failure) 128M->48M(491M) 8.148ms
[0.203s][info   ][gc,cpu      ] GC(0) User=0.01s Sys=0.01s Real=0.01s
[0.230s][info   ][gc,start    ] GC(1) Pause Young (Allocation Failure)
[0.240s][info   ][gc,heap     ] GC(1) PSYoungGen: 153083K(153088K)->21487K(153088K) Eden: 131584K(131584K)->0K(131584K) From: 21499K(21504K)->21487K(21504K)
[0.240s][info   ][gc,heap     ] GC(1) ParOldGen: 27997K(349696K)->77477K(349696K)
[0.240s][info   ][gc,metaspace] GC(1) Metaspace: 224K(4864K)->224K(4864K) NonClass: 212K(4352K)->212K(4352K) Class: 11K(512K)->11K(512K)
[0.240s][info   ][gc          ] GC(1) Pause Young (Allocation Failure) 176M->96M(491M) 10.039ms
[0.241s][info   ][gc,cpu      ] GC(1) User=0.01s Sys=0.03s Real=0.01s
[0.260s][info   ][gc,start    ] GC(2) Pause Young (Allocation Failure)
[0.267s][info   ][gc,heap     ] GC(2) PSYoungGen: 153016K(153088K)->21501K(153088K) Eden: 131528K(131584K)->0K(131584K) From: 21487K(21504K)->21501K(21504K)
[0.267s][info   ][gc,heap     ] GC(2) ParOldGen: 77477K(349696K)->125326K(349696K)
[0.267s][info   ][gc,metaspace] GC(2) Metaspace: 224K(4864K)->224K(4864K) NonClass: 212K(4352K)->212K(4352K) Class: 11K(512K)->11K(512K)
[0.267s][info   ][gc          ] GC(2) Pause Young (Allocation Failure) 225M->143M(491M) 7.561ms
[0.268s][info   ][gc,cpu      ] GC(2) User=0.01s Sys=0.01s Real=0.01s
[0.289s][info   ][gc,start    ] GC(3) Pause Young (Allocation Failure)
[0.296s][info   ][gc,heap     ] GC(3) PSYoungGen: 153085K(153088K)->21491K(153088K) Eden: 131584K(131584K)->0K(131584K) From: 21501K(21504K)->21491K(21504K)
[0.296s][info   ][gc,heap     ] GC(3) ParOldGen: 125326K(349696K)->171273K(349696K)
[0.296s][info   ][gc,metaspace] GC(3) Metaspace: 224K(4864K)->224K(4864K) NonClass: 212K(4352K)->212K(4352K) Class: 11K(512K)->11K(512K)
[0.296s][info   ][gc          ] GC(3) Pause Young (Allocation Failure) 271M->188M(491M) 7.710ms
[0.296s][info   ][gc,cpu      ] GC(3) User=0.01s Sys=0.01s Real=0.00s
[0.319s][info   ][gc,start    ] GC(4) Pause Young (Allocation Failure)
[0.327s][info   ][gc,heap     ] GC(4) PSYoungGen: 153075K(153088K)->21483K(153088K) Eden: 131584K(131584K)->0K(131584K) From: 21491K(21504K)->21483K(21504K)
[0.327s][info   ][gc,heap     ] GC(4) ParOldGen: 171273K(349696K)->219412K(349696K)
[0.328s][info   ][gc,metaspace] GC(4) Metaspace: 224K(4864K)->224K(4864K) NonClass: 212K(4352K)->212K(4352K) Class: 11K(512K)->11K(512K)
[0.328s][info   ][gc          ] GC(4) Pause Young (Allocation Failure) 316M->235M(491M) 8.547ms
[0.328s][info   ][gc,cpu      ] GC(4) User=0.01s Sys=0.02s Real=0.01s
[0.348s][info   ][gc,start    ] GC(5) Pause Young (Allocation Failure)
[0.358s][info   ][gc,heap     ] GC(5) PSYoungGen: 153067K(153088K)->21497K(80384K) Eden: 131584K(131584K)->0K(58880K) From: 21483K(21504K)->21497K(21504K)
[0.358s][info   ][gc,heap     ] GC(5) ParOldGen: 219412K(349696K)->264204K(349696K)
[0.358s][info   ][gc,metaspace] GC(5) Metaspace: 224K(4864K)->224K(4864K) NonClass: 212K(4352K)->212K(4352K) Class: 11K(512K)->11K(512K)
[0.358s][info   ][gc          ] GC(5) Pause Young (Allocation Failure) 363M->279M(420M) 10.340ms
[0.359s][info   ][gc,cpu      ] GC(5) User=0.01s Sys=0.01s Real=0.01s
[0.369s][info   ][gc,start    ] GC(6) Pause Young (Allocation Failure)
[0.374s][info   ][gc,heap     ] GC(6) PSYoungGen: 80377K(80384K)->33535K(116736K) Eden: 58880K(58880K)->0K(58880K) From: 21497K(21504K)->33535K(57856K)
[0.374s][info   ][gc,heap     ] GC(6) ParOldGen: 264204K(349696K)->270712K(349696K)
[0.374s][info   ][gc,metaspace] GC(6) Metaspace: 224K(4864K)->224K(4864K) NonClass: 212K(4352K)->212K(4352K) Class: 11K(512K)->11K(512K)
[0.374s][info   ][gc          ] GC(6) Pause Young (Allocation Failure) 336M->297M(455M) 4.756ms
[0.374s][info   ][gc,cpu      ] GC(6) User=0.01s Sys=0.00s Real=0.00s
[0.384s][info   ][gc,start    ] GC(7) Pause Young (Allocation Failure)
[0.389s][info   ][gc,heap     ] GC(7) PSYoungGen: 92415K(116736K)->50911K(116736K) Eden: 58880K(58880K)->0K(58880K) From: 33535K(57856K)->50911K(57856K)
[0.389s][info   ][gc,heap     ] GC(7) ParOldGen: 270712K(349696K)->276763K(349696K)
[0.389s][info   ][gc,metaspace] GC(7) Metaspace: 224K(4864K)->224K(4864K) NonClass: 212K(4352K)->212K(4352K) Class: 11K(512K)->11K(512K)
[0.389s][info   ][gc          ] GC(7) Pause Young (Allocation Failure) 354M->319M(455M) 5.723ms
[0.389s][info   ][gc,cpu      ] GC(7) User=0.01s Sys=0.00s Real=0.01s
[0.399s][info   ][gc,start    ] GC(8) Pause Young (Allocation Failure)
[0.405s][info   ][gc,heap     ] GC(8) PSYoungGen: 109791K(116736K)->57846K(116736K) Eden: 58880K(58880K)->0K(58880K) From: 50911K(57856K)->57846K(57856K)
[0.405s][info   ][gc,heap     ] GC(8) ParOldGen: 276763K(349696K)->287887K(349696K)
[0.405s][info   ][gc,metaspace] GC(8) Metaspace: 224K(4864K)->224K(4864K) NonClass: 212K(4352K)->212K(4352K) Class: 11K(512K)->11K(512K)
[0.405s][info   ][gc          ] GC(8) Pause Young (Allocation Failure) 377M->337M(455M) 6.263ms
[0.405s][info   ][gc,cpu      ] GC(8) User=0.02s Sys=0.01s Real=0.00s
[0.406s][info   ][gc,start    ] GC(9) Pause Full (Ergonomics)
[0.406s][info   ][gc,phases,start] GC(9) Marking Phase
[0.474s][info   ][gc,phases      ] GC(9) Marking Phase 67.759ms
[0.474s][info   ][gc,phases,start] GC(9) Summary Phase
[0.474s][info   ][gc,phases      ] GC(9) Summary Phase 0.027ms
[0.474s][info   ][gc,phases,start] GC(9) Adjust Roots
[0.475s][info   ][gc,phases      ] GC(9) Adjust Roots 0.651ms
[0.475s][info   ][gc,phases,start] GC(9) Compaction Phase
[0.487s][info   ][gc,phases      ] GC(9) Compaction Phase 12.283ms
[0.487s][info   ][gc,phases,start] GC(9) Post Compact
[0.490s][info   ][gc,phases      ] GC(9) Post Compact 3.367ms
[0.491s][info   ][gc,heap        ] GC(9) PSYoungGen: 57846K(116736K)->0K(116736K) Eden: 0K(58880K)->0K(58880K) From: 57846K(57856K)->0K(57856K)
[0.491s][info   ][gc,heap        ] GC(9) ParOldGen: 287887K(349696K)->234020K(349696K)
[0.491s][info   ][gc,metaspace   ] GC(9) Metaspace: 224K(4864K)->224K(4864K) NonClass: 212K(4352K)->212K(4352K) Class: 11K(512K)->11K(512K)
[0.491s][info   ][gc             ] GC(9) Pause Full (Ergonomics) 337M->228M(455M) 85.056ms
[0.491s][info   ][gc,cpu         ] GC(9) User=0.10s Sys=0.11s Real=0.09s
[0.499s][info   ][gc,start       ] GC(10) Pause Young (Allocation Failure)
[0.502s][info   ][gc,heap        ] GC(10) PSYoungGen: 58880K(116736K)->28797K(116736K) Eden: 58880K(58880K)->0K(58880K) From: 0K(57856K)->28797K(57856K)
[0.502s][info   ][gc,heap        ] GC(10) ParOldGen: 234020K(349696K)->234020K(349696K)
[0.502s][info   ][gc,metaspace   ] GC(10) Metaspace: 224K(4864K)->224K(4864K) NonClass: 212K(4352K)->212K(4352K) Class: 11K(512K)->11K(512K)
[0.502s][info   ][gc             ] GC(10) Pause Young (Allocation Failure) 286M->256M(455M) 3.008ms
[0.502s][info   ][gc,cpu         ] GC(10) User=0.01s Sys=0.00s Real=0.00s
[0.511s][info   ][gc,start       ] GC(11) Pause Young (Allocation Failure)
[0.515s][info   ][gc,heap        ] GC(11) PSYoungGen: 87677K(116736K)->21766K(116736K) Eden: 58880K(58880K)->0K(58880K) From: 28797K(57856K)->21766K(57856K)
[0.515s][info   ][gc,heap        ] GC(11) ParOldGen: 234020K(349696K)->261585K(349696K)
[0.515s][info   ][gc,metaspace   ] GC(11) Metaspace: 224K(4864K)->224K(4864K) NonClass: 212K(4352K)->212K(4352K) Class: 11K(512K)->11K(512K)
[0.515s][info   ][gc             ] GC(11) Pause Young (Allocation Failure) 314M->276M(455M) 3.876ms
[0.515s][info   ][gc,cpu         ] GC(11) User=0.01s Sys=0.00s Real=0.00s
[0.525s][info   ][gc,start       ] GC(12) Pause Young (Allocation Failure)
[0.530s][info   ][gc,heap        ] GC(12) PSYoungGen: 80646K(116736K)->22237K(116736K) Eden: 58880K(58880K)->0K(58880K) From: 21766K(57856K)->22237K(57856K)
[0.530s][info   ][gc,heap        ] GC(12) ParOldGen: 261585K(349696K)->281477K(349696K)
[0.530s][info   ][gc,metaspace   ] GC(12) Metaspace: 224K(4864K)->224K(4864K) NonClass: 212K(4352K)->212K(4352K) Class: 11K(512K)->11K(512K)
[0.530s][info   ][gc             ] GC(12) Pause Young (Allocation Failure) 334M->296M(455M) 4.993ms
[0.530s][info   ][gc,cpu         ] GC(12) User=0.02s Sys=0.00s Real=0.01s
[0.539s][info   ][gc,start       ] GC(13) Pause Young (Allocation Failure)
[0.543s][info   ][gc,heap        ] GC(13) PSYoungGen: 81012K(116736K)->18506K(116736K) Eden: 58774K(58880K)->0K(58880K) From: 22237K(57856K)->18506K(57856K)
[0.543s][info   ][gc,heap        ] GC(13) ParOldGen: 281477K(349696K)->303216K(349696K)
[0.543s][info   ][gc,metaspace   ] GC(13) Metaspace: 224K(4864K)->224K(4864K) NonClass: 212K(4352K)->212K(4352K) Class: 11K(512K)->11K(512K)
[0.543s][info   ][gc             ] GC(13) Pause Young (Allocation Failure) 353M->314M(455M) 4.085ms
[0.543s][info   ][gc,cpu         ] GC(13) User=0.01s Sys=0.00s Real=0.00s
[0.544s][info   ][gc,start       ] GC(14) Pause Full (Ergonomics)
[0.544s][info   ][gc,phases,start] GC(14) Marking Phase
[0.554s][info   ][gc,phases      ] GC(14) Marking Phase 9.922ms
[0.554s][info   ][gc,phases,start] GC(14) Summary Phase
[0.554s][info   ][gc,phases      ] GC(14) Summary Phase 0.035ms
[0.554s][info   ][gc,phases,start] GC(14) Adjust Roots
[0.555s][info   ][gc,phases      ] GC(14) Adjust Roots 0.790ms
[0.555s][info   ][gc,phases,start] GC(14) Compaction Phase
[0.571s][info   ][gc,phases      ] GC(14) Compaction Phase 15.834ms
[0.571s][info   ][gc,phases,start] GC(14) Post Compact
[0.572s][info   ][gc,phases      ] GC(14) Post Compact 0.911ms
[0.572s][info   ][gc,heap        ] GC(14) PSYoungGen: 18506K(116736K)->0K(116736K) Eden: 0K(58880K)->0K(58880K) From: 18506K(57856K)->0K(57856K)
[0.572s][info   ][gc,heap        ] GC(14) ParOldGen: 303216K(349696K)->262841K(349696K)
[0.572s][info   ][gc,metaspace   ] GC(14) Metaspace: 224K(4864K)->224K(4864K) NonClass: 212K(4352K)->212K(4352K) Class: 11K(512K)->11K(512K)
[0.572s][info   ][gc             ] GC(14) Pause Full (Ergonomics) 314M->256M(455M) 28.191ms
[0.572s][info   ][gc,cpu         ] GC(14) User=0.07s Sys=0.02s Real=0.03s
[0.581s][info   ][gc,start       ] GC(15) Pause Young (Allocation Failure)
[0.584s][info   ][gc,heap        ] GC(15) PSYoungGen: 58843K(116736K)->19549K(116736K) Eden: 58843K(58880K)->0K(58880K) From: 0K(57856K)->19549K(57856K)
[0.584s][info   ][gc,heap        ] GC(15) ParOldGen: 262841K(349696K)->262841K(349696K)
[0.584s][info   ][gc,metaspace   ] GC(15) Metaspace: 224K(4864K)->224K(4864K) NonClass: 212K(4352K)->212K(4352K) Class: 11K(512K)->11K(512K)
[0.584s][info   ][gc             ] GC(15) Pause Young (Allocation Failure) 314M->275M(455M) 3.151ms
[0.584s][info   ][gc,cpu         ] GC(15) User=0.00s Sys=0.00s Real=0.00s
[0.594s][info   ][gc,start       ] GC(16) Pause Young (Allocation Failure)
[0.597s][info   ][gc,heap        ] GC(16) PSYoungGen: 78389K(116736K)->22288K(116736K) Eden: 58840K(58880K)->0K(58880K) From: 19549K(57856K)->22288K(57856K)
[0.597s][info   ][gc,heap        ] GC(16) ParOldGen: 262841K(349696K)->280927K(349696K)
[0.597s][info   ][gc,metaspace   ] GC(16) Metaspace: 224K(4864K)->224K(4864K) NonClass: 212K(4352K)->212K(4352K) Class: 11K(512K)->11K(512K)
[0.597s][info   ][gc             ] GC(16) Pause Young (Allocation Failure) 333M->296M(455M) 3.263ms
[0.597s][info   ][gc,cpu         ] GC(16) User=0.01s Sys=0.00s Real=0.01s
[0.606s][info   ][gc,start       ] GC(17) Pause Young (Allocation Failure)
[0.609s][info   ][gc,heap        ] GC(17) PSYoungGen: 81168K(116736K)->24787K(116736K) Eden: 58880K(58880K)->0K(58880K) From: 22288K(57856K)->24787K(57856K)
[0.610s][info   ][gc,heap        ] GC(17) ParOldGen: 280927K(349696K)->302084K(349696K)
[0.610s][info   ][gc,metaspace   ] GC(17) Metaspace: 224K(4864K)->224K(4864K) NonClass: 212K(4352K)->212K(4352K) Class: 11K(512K)->11K(512K)
[0.610s][info   ][gc             ] GC(17) Pause Young (Allocation Failure) 353M->319M(455M) 3.928ms
[0.610s][info   ][gc,cpu         ] GC(17) User=0.02s Sys=0.00s Real=0.01s
[0.610s][info   ][gc,start       ] GC(18) Pause Full (Ergonomics)
[0.610s][info   ][gc,phases,start] GC(18) Marking Phase
[0.613s][info   ][gc,phases      ] GC(18) Marking Phase 3.566ms
[0.614s][info   ][gc,phases,start] GC(18) Summary Phase
[0.614s][info   ][gc,phases      ] GC(18) Summary Phase 0.029ms
[0.614s][info   ][gc,phases,start] GC(18) Adjust Roots
[0.615s][info   ][gc,phases      ] GC(18) Adjust Roots 0.962ms
[0.615s][info   ][gc,phases,start] GC(18) Compaction Phase
[0.629s][info   ][gc,phases      ] GC(18) Compaction Phase 14.260ms
[0.629s][info   ][gc,phases,start] GC(18) Post Compact
[0.630s][info   ][gc,phases      ] GC(18) Post Compact 0.836ms
[0.630s][info   ][gc,heap        ] GC(18) PSYoungGen: 24787K(116736K)->0K(116736K) Eden: 0K(58880K)->0K(58880K) From: 24787K(57856K)->0K(57856K)
[0.630s][info   ][gc,heap        ] GC(18) ParOldGen: 302084K(349696K)->276278K(349696K)
[0.630s][info   ][gc,metaspace   ] GC(18) Metaspace: 224K(4864K)->224K(4864K) NonClass: 212K(4352K)->212K(4352K) Class: 11K(512K)->11K(512K)
[0.630s][info   ][gc             ] GC(18) Pause Full (Ergonomics) 319M->269M(455M) 20.476ms
[0.630s][info   ][gc,cpu         ] GC(18) User=0.05s Sys=0.00s Real=0.02s
[0.639s][info   ][gc,start       ] GC(19) Pause Young (Allocation Failure)
[0.641s][info   ][gc,heap        ] GC(19) PSYoungGen: 58858K(116736K)->23102K(116736K) Eden: 58858K(58880K)->0K(58880K) From: 0K(57856K)->23102K(57856K)
[0.641s][info   ][gc,heap        ] GC(19) ParOldGen: 276278K(349696K)->276278K(349696K)
[0.641s][info   ][gc,metaspace   ] GC(19) Metaspace: 224K(4864K)->224K(4864K) NonClass: 212K(4352K)->212K(4352K) Class: 11K(512K)->11K(512K)
[0.642s][info   ][gc             ] GC(19) Pause Young (Allocation Failure) 327M->292M(455M) 2.340ms
[0.642s][info   ][gc,cpu         ] GC(19) User=0.01s Sys=0.00s Real=0.00s
[0.652s][info   ][gc,start       ] GC(20) Pause Young (Allocation Failure)
[0.655s][info   ][gc,heap        ] GC(20) PSYoungGen: 81982K(116736K)->21403K(116736K) Eden: 58880K(58880K)->0K(58880K) From: 23102K(57856K)->21403K(57856K)
[0.656s][info   ][gc,heap        ] GC(20) ParOldGen: 276278K(349696K)->296962K(349696K)
[0.656s][info   ][gc,metaspace   ] GC(20) Metaspace: 224K(4864K)->224K(4864K) NonClass: 212K(4352K)->212K(4352K) Class: 11K(512K)->11K(512K)
[0.656s][info   ][gc             ] GC(20) Pause Young (Allocation Failure) 349M->310M(455M) 3.583ms
[0.656s][info   ][gc,cpu         ] GC(20) User=0.01s Sys=0.00s Real=0.00s
[0.665s][info   ][gc,start       ] GC(21) Pause Young (Allocation Failure)
[0.669s][info   ][gc,heap        ] GC(21) PSYoungGen: 79910K(116736K)->21201K(116736K) Eden: 58507K(58880K)->0K(58880K) From: 21403K(57856K)->21201K(57856K)
[0.669s][info   ][gc,heap        ] GC(21) ParOldGen: 296962K(349696K)->317566K(349696K)
[0.669s][info   ][gc,metaspace   ] GC(21) Metaspace: 224K(4864K)->224K(4864K) NonClass: 212K(4352K)->212K(4352K) Class: 11K(512K)->11K(512K)
[0.669s][info   ][gc             ] GC(21) Pause Young (Allocation Failure) 368M->330M(455M) 4.854ms
[0.670s][info   ][gc,cpu         ] GC(21) User=0.01s Sys=0.00s Real=0.01s
[0.670s][info   ][gc,start       ] GC(22) Pause Full (Ergonomics)
[0.670s][info   ][gc,phases,start] GC(22) Marking Phase
[0.675s][info   ][gc,phases      ] GC(22) Marking Phase 4.808ms
[0.675s][info   ][gc,phases,start] GC(22) Summary Phase
[0.675s][info   ][gc,phases      ] GC(22) Summary Phase 0.032ms
[0.675s][info   ][gc,phases,start] GC(22) Adjust Roots
[0.675s][info   ][gc,phases      ] GC(22) Adjust Roots 0.305ms
[0.675s][info   ][gc,phases,start] GC(22) Compaction Phase
[0.692s][info   ][gc,phases      ] GC(22) Compaction Phase 17.071ms
[0.692s][info   ][gc,phases,start] GC(22) Post Compact
[0.694s][info   ][gc,phases      ] GC(22) Post Compact 0.998ms
[0.694s][info   ][gc,heap        ] GC(22) PSYoungGen: 21201K(116736K)->0K(116736K) Eden: 0K(58880K)->0K(58880K) From: 21201K(57856K)->0K(57856K)
[0.694s][info   ][gc,heap        ] GC(22) ParOldGen: 317566K(349696K)->292083K(349696K)
[0.694s][info   ][gc,metaspace   ] GC(22) Metaspace: 224K(4864K)->224K(4864K) NonClass: 212K(4352K)->212K(4352K) Class: 11K(512K)->11K(512K)
[0.694s][info   ][gc             ] GC(22) Pause Full (Ergonomics) 330M->285M(455M) 24.077ms
[0.694s][info   ][gc,cpu         ] GC(22) User=0.07s Sys=0.01s Real=0.02s
[0.703s][info   ][gc,start       ] GC(23) Pause Young (Allocation Failure)
[0.706s][info   ][gc,heap        ] GC(23) PSYoungGen: 58618K(116736K)->26820K(116736K) Eden: 58618K(58880K)->0K(58880K) From: 0K(57856K)->26820K(57856K)
[0.706s][info   ][gc,heap        ] GC(23) ParOldGen: 292083K(349696K)->292083K(349696K)
[0.706s][info   ][gc,metaspace   ] GC(23) Metaspace: 224K(4864K)->224K(4864K) NonClass: 212K(4352K)->212K(4352K) Class: 11K(512K)->11K(512K)
[0.706s][info   ][gc             ] GC(23) Pause Young (Allocation Failure) 342M->311M(455M) 3.088ms
[0.706s][info   ][gc,cpu         ] GC(23) User=0.00s Sys=0.00s Real=0.00s
[0.716s][info   ][gc,start       ] GC(24) Pause Young (Allocation Failure)
[0.719s][info   ][gc,heap        ] GC(24) PSYoungGen: 85700K(116736K)->18837K(116736K) Eden: 58880K(58880K)->0K(58880K) From: 26820K(57856K)->18837K(57856K)
[0.719s][info   ][gc,heap        ] GC(24) ParOldGen: 292083K(349696K)->318462K(349696K)
[0.719s][info   ][gc,metaspace   ] GC(24) Metaspace: 224K(4864K)->224K(4864K) NonClass: 212K(4352K)->212K(4352K) Class: 11K(512K)->11K(512K)
[0.719s][info   ][gc             ] GC(24) Pause Young (Allocation Failure) 368M->329M(455M) 3.859ms
[0.719s][info   ][gc,cpu         ] GC(24) User=0.01s Sys=0.00s Real=0.01s
[0.720s][info   ][gc,start       ] GC(25) Pause Full (Ergonomics)
[0.720s][info   ][gc,phases,start] GC(25) Marking Phase
[0.722s][info   ][gc,phases      ] GC(25) Marking Phase 1.714ms
[0.722s][info   ][gc,phases,start] GC(25) Summary Phase
[0.722s][info   ][gc,phases      ] GC(25) Summary Phase 0.032ms
[0.722s][info   ][gc,phases,start] GC(25) Adjust Roots
[0.722s][info   ][gc,phases      ] GC(25) Adjust Roots 0.280ms
[0.722s][info   ][gc,phases,start] GC(25) Compaction Phase
[0.739s][info   ][gc,phases      ] GC(25) Compaction Phase 17.195ms
[0.740s][info   ][gc,phases,start] GC(25) Post Compact
[0.740s][info   ][gc,phases      ] GC(25) Post Compact 0.661ms
[0.741s][info   ][gc,heap        ] GC(25) PSYoungGen: 18837K(116736K)->0K(116736K) Eden: 0K(58880K)->0K(58880K) From: 18837K(57856K)->0K(57856K)
[0.741s][info   ][gc,heap        ] GC(25) ParOldGen: 318462K(349696K)->292385K(349696K)
[0.741s][info   ][gc,metaspace   ] GC(25) Metaspace: 224K(4864K)->224K(4864K) NonClass: 212K(4352K)->212K(4352K) Class: 11K(512K)->11K(512K)
[0.741s][info   ][gc             ] GC(25) Pause Full (Ergonomics) 329M->285M(455M) 21.098ms
[0.741s][info   ][gc,cpu         ] GC(25) User=0.07s Sys=0.00s Real=0.02s
[0.750s][info   ][gc,start       ] GC(26) Pause Young (Allocation Failure)
[0.754s][info   ][gc,heap        ] GC(26) PSYoungGen: 58880K(116736K)->20765K(116736K) Eden: 58880K(58880K)->0K(58880K) From: 0K(57856K)->20765K(57856K)
[0.754s][info   ][gc,heap        ] GC(26) ParOldGen: 292385K(349696K)->292385K(349696K)
[0.754s][info   ][gc,metaspace   ] GC(26) Metaspace: 224K(4864K)->224K(4864K) NonClass: 212K(4352K)->212K(4352K) Class: 11K(512K)->11K(512K)
[0.754s][info   ][gc             ] GC(26) Pause Young (Allocation Failure) 343M->305M(455M) 3.406ms
[0.754s][info   ][gc,cpu         ] GC(26) User=0.00s Sys=0.00s Real=0.00s
[0.764s][info   ][gc,start       ] GC(27) Pause Young (Allocation Failure)
[0.768s][info   ][gc,heap        ] GC(27) PSYoungGen: 79645K(116736K)->22327K(116736K) Eden: 58880K(58880K)->0K(58880K) From: 20765K(57856K)->22327K(57856K)
[0.768s][info   ][gc,heap        ] GC(27) ParOldGen: 292385K(349696K)->312687K(349696K)
[0.768s][info   ][gc,metaspace   ] GC(27) Metaspace: 224K(4864K)->224K(4864K) NonClass: 212K(4352K)->212K(4352K) Class: 11K(512K)->11K(512K)
[0.768s][info   ][gc             ] GC(27) Pause Young (Allocation Failure) 363M->327M(455M) 3.857ms
[0.768s][info   ][gc,cpu         ] GC(27) User=0.01s Sys=0.00s Real=0.01s
[0.768s][info   ][gc,start       ] GC(28) Pause Full (Ergonomics)
[0.768s][info   ][gc,phases,start] GC(28) Marking Phase
[0.770s][info   ][gc,phases      ] GC(28) Marking Phase 1.998ms
[0.770s][info   ][gc,phases,start] GC(28) Summary Phase
[0.770s][info   ][gc,phases      ] GC(28) Summary Phase 0.023ms
[0.770s][info   ][gc,phases,start] GC(28) Adjust Roots
[0.771s][info   ][gc,phases      ] GC(28) Adjust Roots 0.477ms
[0.771s][info   ][gc,phases,start] GC(28) Compaction Phase
[0.788s][info   ][gc,phases      ] GC(28) Compaction Phase 16.989ms
[0.788s][info   ][gc,phases,start] GC(28) Post Compact
[0.789s][info   ][gc,phases      ] GC(28) Post Compact 0.482ms
[0.789s][info   ][gc,heap        ] GC(28) PSYoungGen: 22327K(116736K)->0K(116736K) Eden: 0K(58880K)->0K(58880K) From: 22327K(57856K)->0K(57856K)
[0.789s][info   ][gc,heap        ] GC(28) ParOldGen: 312687K(349696K)->303704K(349696K)
[0.789s][info   ][gc,metaspace   ] GC(28) Metaspace: 224K(4864K)->224K(4864K) NonClass: 212K(4352K)->212K(4352K) Class: 11K(512K)->11K(512K)
[0.789s][info   ][gc             ] GC(28) Pause Full (Ergonomics) 327M->296M(455M) 20.702ms
[0.790s][info   ][gc,cpu         ] GC(28) User=0.07s Sys=0.00s Real=0.02s
[0.799s][info   ][gc,start       ] GC(29) Pause Young (Allocation Failure)
[0.802s][info   ][gc,heap        ] GC(29) PSYoungGen: 58332K(116736K)->22238K(116736K) Eden: 58332K(58880K)->0K(58880K) From: 0K(57856K)->22238K(57856K)
[0.802s][info   ][gc,heap        ] GC(29) ParOldGen: 303704K(349696K)->303704K(349696K)
[0.802s][info   ][gc,metaspace   ] GC(29) Metaspace: 224K(4864K)->224K(4864K) NonClass: 212K(4352K)->212K(4352K) Class: 11K(512K)->11K(512K)
[0.802s][info   ][gc             ] GC(29) Pause Young (Allocation Failure) 353M->318M(455M) 3.040ms
[0.802s][info   ][gc,cpu         ] GC(29) User=0.01s Sys=0.00s Real=0.00s
[0.811s][info   ][gc,start       ] GC(30) Pause Young (Allocation Failure)
[0.815s][info   ][gc,heap        ] GC(30) PSYoungGen: 81118K(116736K)->23293K(116736K) Eden: 58880K(58880K)->0K(58880K) From: 22238K(57856K)->23293K(57856K)
[0.815s][info   ][gc,heap        ] GC(30) ParOldGen: 303704K(349696K)->324668K(349696K)
[0.815s][info   ][gc,metaspace   ] GC(30) Metaspace: 224K(4864K)->224K(4864K) NonClass: 212K(4352K)->212K(4352K) Class: 11K(512K)->11K(512K)
[0.816s][info   ][gc             ] GC(30) Pause Young (Allocation Failure) 375M->339M(455M) 4.648ms
[0.816s][info   ][gc,cpu         ] GC(30) User=0.00s Sys=0.00s Real=0.00s
[0.816s][info   ][gc,start       ] GC(31) Pause Full (Ergonomics)
[0.816s][info   ][gc,phases,start] GC(31) Marking Phase
[0.819s][info   ][gc,phases      ] GC(31) Marking Phase 3.014ms
[0.819s][info   ][gc,phases,start] GC(31) Summary Phase
[0.819s][info   ][gc,phases      ] GC(31) Summary Phase 0.028ms
[0.819s][info   ][gc,phases,start] GC(31) Adjust Roots
[0.820s][info   ][gc,phases      ] GC(31) Adjust Roots 0.564ms
[0.820s][info   ][gc,phases,start] GC(31) Compaction Phase
[0.836s][info   ][gc,phases      ] GC(31) Compaction Phase 16.797ms
[0.837s][info   ][gc,phases,start] GC(31) Post Compact
[0.837s][info   ][gc,phases      ] GC(31) Post Compact 0.527ms
[0.837s][info   ][gc,heap        ] GC(31) PSYoungGen: 23293K(116736K)->0K(116736K) Eden: 0K(58880K)->0K(58880K) From: 23293K(57856K)->0K(57856K)
[0.837s][info   ][gc,heap        ] GC(31) ParOldGen: 324668K(349696K)->311134K(349696K)
[0.837s][info   ][gc,metaspace   ] GC(31) Metaspace: 224K(4864K)->224K(4864K) NonClass: 212K(4352K)->212K(4352K) Class: 11K(512K)->11K(512K)
[0.837s][info   ][gc             ] GC(31) Pause Full (Ergonomics) 339M->303M(455M) 21.562ms
[0.837s][info   ][gc,cpu         ] GC(31) User=0.07s Sys=0.01s Real=0.03s
[0.847s][info   ][gc,start       ] GC(32) Pause Young (Allocation Failure)
[0.850s][info   ][gc,heap        ] GC(32) PSYoungGen: 58880K(116736K)->22630K(116736K) Eden: 58880K(58880K)->0K(58880K) From: 0K(57856K)->22630K(57856K)
[0.850s][info   ][gc,heap        ] GC(32) ParOldGen: 311134K(349696K)->311134K(349696K)
[0.850s][info   ][gc,metaspace   ] GC(32) Metaspace: 224K(4864K)->224K(4864K) NonClass: 212K(4352K)->212K(4352K) Class: 11K(512K)->11K(512K)
[0.850s][info   ][gc             ] GC(32) Pause Young (Allocation Failure) 361M->325M(455M) 2.968ms
[0.850s][info   ][gc,cpu         ] GC(32) User=0.00s Sys=0.00s Real=0.00s
[0.858s][info   ][gc,start       ] GC(33) Pause Young (Allocation Failure)
[0.862s][info   ][gc,heap        ] GC(33) PSYoungGen: 81390K(116736K)->21202K(116736K) Eden: 58760K(58880K)->0K(58880K) From: 22630K(57856K)->21202K(57856K)
[0.862s][info   ][gc,heap        ] GC(33) ParOldGen: 311134K(349696K)->332268K(349696K)
[0.862s][info   ][gc,metaspace   ] GC(33) Metaspace: 224K(4864K)->224K(4864K) NonClass: 212K(4352K)->212K(4352K) Class: 11K(512K)->11K(512K)
[0.862s][info   ][gc             ] GC(33) Pause Young (Allocation Failure) 383M->345M(455M) 4.320ms
[0.862s][info   ][gc,cpu         ] GC(33) User=0.00s Sys=0.01s Real=0.00s
[0.862s][info   ][gc,start       ] GC(34) Pause Full (Ergonomics)
[0.863s][info   ][gc,phases,start] GC(34) Marking Phase
[0.867s][info   ][gc,phases      ] GC(34) Marking Phase 3.883ms
[0.867s][info   ][gc,phases,start] GC(34) Summary Phase
[0.867s][info   ][gc,phases      ] GC(34) Summary Phase 0.034ms
[0.867s][info   ][gc,phases,start] GC(34) Adjust Roots
[0.867s][info   ][gc,phases      ] GC(34) Adjust Roots 0.217ms
[0.867s][info   ][gc,phases,start] GC(34) Compaction Phase
[0.886s][info   ][gc,phases      ] GC(34) Compaction Phase 18.527ms
[0.886s][info   ][gc,phases,start] GC(34) Post Compact
[0.886s][info   ][gc,phases      ] GC(34) Post Compact 0.540ms
[0.887s][info   ][gc,heap        ] GC(34) PSYoungGen: 21202K(116736K)->0K(116736K) Eden: 0K(58880K)->0K(58880K) From: 21202K(57856K)->0K(57856K)
[0.887s][info   ][gc,heap        ] GC(34) ParOldGen: 332268K(349696K)->317528K(349696K)
[0.887s][info   ][gc,metaspace   ] GC(34) Metaspace: 224K(4864K)->224K(4864K) NonClass: 212K(4352K)->212K(4352K) Class: 11K(512K)->11K(512K)
[0.887s][info   ][gc             ] GC(34) Pause Full (Ergonomics) 345M->310M(455M) 24.157ms
[0.887s][info   ][gc,cpu         ] GC(34) User=0.08s Sys=0.00s Real=0.02s
[0.896s][info   ][gc,start       ] GC(35) Pause Full (Ergonomics)
[0.897s][info   ][gc,phases,start] GC(35) Marking Phase
[0.907s][info   ][gc,phases      ] GC(35) Marking Phase 10.157ms
[0.907s][info   ][gc,phases,start] GC(35) Summary Phase
[0.907s][info   ][gc,phases      ] GC(35) Summary Phase 0.034ms
[0.907s][info   ][gc,phases,start] GC(35) Adjust Roots
[0.907s][info   ][gc,phases      ] GC(35) Adjust Roots 0.306ms
[0.907s][info   ][gc,phases,start] GC(35) Compaction Phase
[0.926s][info   ][gc,phases      ] GC(35) Compaction Phase 18.583ms
[0.926s][info   ][gc,phases,start] GC(35) Post Compact
[0.928s][info   ][gc,phases      ] GC(35) Post Compact 1.557ms
[0.928s][info   ][gc,heap        ] GC(35) PSYoungGen: 58542K(116736K)->0K(116736K) Eden: 58542K(58880K)->0K(58880K) From: 0K(57856K)->0K(57856K)
[0.928s][info   ][gc,heap        ] GC(35) ParOldGen: 317528K(349696K)->320672K(349696K)
[0.928s][info   ][gc,metaspace   ] GC(35) Metaspace: 224K(4864K)->224K(4864K) NonClass: 212K(4352K)->212K(4352K) Class: 11K(512K)->11K(512K)
[0.928s][info   ][gc             ] GC(35) Pause Full (Ergonomics) 367M->313M(455M) 31.339ms
[0.928s][info   ][gc,cpu         ] GC(35) User=0.08s Sys=0.02s Real=0.04s
[0.938s][info   ][gc,start       ] GC(36) Pause Full (Ergonomics)
[0.938s][info   ][gc,phases,start] GC(36) Marking Phase
[0.940s][info   ][gc,phases      ] GC(36) Marking Phase 1.667ms
[0.940s][info   ][gc,phases,start] GC(36) Summary Phase
[0.940s][info   ][gc,phases      ] GC(36) Summary Phase 0.033ms
[0.940s][info   ][gc,phases,start] GC(36) Adjust Roots
[0.940s][info   ][gc,phases      ] GC(36) Adjust Roots 0.449ms
[0.941s][info   ][gc,phases,start] GC(36) Compaction Phase
[0.958s][info   ][gc,phases      ] GC(36) Compaction Phase 17.532ms
[0.958s][info   ][gc,phases,start] GC(36) Post Compact
[0.959s][info   ][gc,phases      ] GC(36) Post Compact 0.590ms
[0.959s][info   ][gc,heap        ] GC(36) PSYoungGen: 58880K(116736K)->0K(116736K) Eden: 58880K(58880K)->0K(58880K) From: 0K(57856K)->0K(57856K)
[0.959s][info   ][gc,heap        ] GC(36) ParOldGen: 320672K(349696K)->321338K(349696K)
[0.959s][info   ][gc,metaspace   ] GC(36) Metaspace: 224K(4864K)->224K(4864K) NonClass: 212K(4352K)->212K(4352K) Class: 11K(512K)->11K(512K)
[0.959s][info   ][gc             ] GC(36) Pause Full (Ergonomics) 370M->313M(455M) 20.996ms
[0.959s][info   ][gc,cpu         ] GC(36) User=0.07s Sys=0.00s Real=0.02s
[0.969s][info   ][gc,start       ] GC(37) Pause Full (Ergonomics)
[0.969s][info   ][gc,phases,start] GC(37) Marking Phase
[0.972s][info   ][gc,phases      ] GC(37) Marking Phase 2.264ms
[0.972s][info   ][gc,phases,start] GC(37) Summary Phase
[0.972s][info   ][gc,phases      ] GC(37) Summary Phase 0.028ms
[0.972s][info   ][gc,phases,start] GC(37) Adjust Roots
[0.972s][info   ][gc,phases      ] GC(37) Adjust Roots 0.674ms
[0.973s][info   ][gc,phases,start] GC(37) Compaction Phase
[0.993s][info   ][gc,phases      ] GC(37) Compaction Phase 20.669ms
[0.993s][info   ][gc,phases,start] GC(37) Post Compact
[0.994s][info   ][gc,phases      ] GC(37) Post Compact 0.817ms
[0.994s][info   ][gc,heap        ] GC(37) PSYoungGen: 58880K(116736K)->0K(116736K) Eden: 58880K(58880K)->0K(58880K) From: 0K(57856K)->0K(57856K)
[0.994s][info   ][gc,heap        ] GC(37) ParOldGen: 321338K(349696K)->325777K(349696K)
[0.994s][info   ][gc,metaspace   ] GC(37) Metaspace: 224K(4864K)->224K(4864K) NonClass: 212K(4352K)->212K(4352K) Class: 11K(512K)->11K(512K)
[0.994s][info   ][gc             ] GC(37) Pause Full (Ergonomics) 371M->318M(455M) 25.027ms
[0.995s][info   ][gc,cpu         ] GC(37) User=0.08s Sys=0.00s Real=0.02s
[1.003s][info   ][gc,start       ] GC(38) Pause Full (Ergonomics)
[1.003s][info   ][gc,phases,start] GC(38) Marking Phase
[1.005s][info   ][gc,phases      ] GC(38) Marking Phase 2.015ms
[1.006s][info   ][gc,phases,start] GC(38) Summary Phase
[1.006s][info   ][gc,phases      ] GC(38) Summary Phase 0.049ms
[1.006s][info   ][gc,phases,start] GC(38) Adjust Roots
[1.006s][info   ][gc,phases      ] GC(38) Adjust Roots 0.622ms
[1.006s][info   ][gc,phases,start] GC(38) Compaction Phase
[1.026s][info   ][gc,phases      ] GC(38) Compaction Phase 19.216ms
[1.026s][info   ][gc,phases,start] GC(38) Post Compact
[1.026s][info   ][gc,phases      ] GC(38) Post Compact 0.795ms
[1.027s][info   ][gc,heap        ] GC(38) PSYoungGen: 58880K(116736K)->0K(116736K) Eden: 58880K(58880K)->0K(58880K) From: 0K(57856K)->0K(57856K)
[1.027s][info   ][gc,heap        ] GC(38) ParOldGen: 325777K(349696K)->326922K(349696K)
[1.027s][info   ][gc,metaspace   ] GC(38) Metaspace: 224K(4864K)->224K(4864K) NonClass: 212K(4352K)->212K(4352K) Class: 11K(512K)->11K(512K)
[1.027s][info   ][gc             ] GC(38) Pause Full (Ergonomics) 375M->319M(455M) 23.273ms
[1.027s][info   ][gc,cpu         ] GC(38) User=0.07s Sys=0.00s Real=0.02s
[1.037s][info   ][gc,start       ] GC(39) Pause Full (Ergonomics)
[1.037s][info   ][gc,phases,start] GC(39) Marking Phase
[1.039s][info   ][gc,phases      ] GC(39) Marking Phase 1.753ms
[1.039s][info   ][gc,phases,start] GC(39) Summary Phase
[1.039s][info   ][gc,phases      ] GC(39) Summary Phase 0.043ms
[1.039s][info   ][gc,phases,start] GC(39) Adjust Roots
[1.039s][info   ][gc,phases      ] GC(39) Adjust Roots 0.192ms
[1.039s][info   ][gc,phases,start] GC(39) Compaction Phase
[1.057s][info   ][gc,phases      ] GC(39) Compaction Phase 18.334ms
[1.058s][info   ][gc,phases,start] GC(39) Post Compact
[1.058s][info   ][gc,phases      ] GC(39) Post Compact 0.772ms
[1.058s][info   ][gc,heap        ] GC(39) PSYoungGen: 58790K(116736K)->0K(116736K) Eden: 58790K(58880K)->0K(58880K) From: 0K(57856K)->0K(57856K)
[1.058s][info   ][gc,heap        ] GC(39) ParOldGen: 326922K(349696K)->329924K(349696K)
[1.058s][info   ][gc,metaspace   ] GC(39) Metaspace: 224K(4864K)->224K(4864K) NonClass: 212K(4352K)->212K(4352K) Class: 11K(512K)->11K(512K)
[1.059s][info   ][gc             ] GC(39) Pause Full (Ergonomics) 376M->322M(455M) 21.867ms
[1.059s][info   ][gc,cpu         ] GC(39) User=0.08s Sys=0.00s Real=0.03s
[1.068s][info   ][gc,start       ] GC(40) Pause Full (Ergonomics)
[1.068s][info   ][gc,phases,start] GC(40) Marking Phase
[1.071s][info   ][gc,phases      ] GC(40) Marking Phase 2.476ms
[1.071s][info   ][gc,phases,start] GC(40) Summary Phase
[1.071s][info   ][gc,phases      ] GC(40) Summary Phase 0.028ms
[1.071s][info   ][gc,phases,start] GC(40) Adjust Roots
[1.071s][info   ][gc,phases      ] GC(40) Adjust Roots 0.239ms
[1.071s][info   ][gc,phases,start] GC(40) Compaction Phase
[1.089s][info   ][gc,phases      ] GC(40) Compaction Phase 17.773ms
[1.089s][info   ][gc,phases,start] GC(40) Post Compact
[1.090s][info   ][gc,phases      ] GC(40) Post Compact 0.608ms
[1.090s][info   ][gc,heap        ] GC(40) PSYoungGen: 58842K(116736K)->0K(116736K) Eden: 58842K(58880K)->0K(58880K) From: 0K(57856K)->0K(57856K)
[1.090s][info   ][gc,heap        ] GC(40) ParOldGen: 329924K(349696K)->330459K(349696K)
[1.090s][info   ][gc,metaspace   ] GC(40) Metaspace: 224K(4864K)->224K(4864K) NonClass: 212K(4352K)->212K(4352K) Class: 11K(512K)->11K(512K)
[1.090s][info   ][gc             ] GC(40) Pause Full (Ergonomics) 379M->322M(455M) 22.049ms
[1.090s][info   ][gc,cpu         ] GC(40) User=0.07s Sys=0.00s Real=0.02s
[1.100s][info   ][gc,start       ] GC(41) Pause Full (Ergonomics)
[1.100s][info   ][gc,phases,start] GC(41) Marking Phase
[1.102s][info   ][gc,phases      ] GC(41) Marking Phase 1.919ms
[1.102s][info   ][gc,phases,start] GC(41) Summary Phase
[1.102s][info   ][gc,phases      ] GC(41) Summary Phase 0.052ms
[1.102s][info   ][gc,phases,start] GC(41) Adjust Roots
[1.103s][info   ][gc,phases      ] GC(41) Adjust Roots 0.244ms
[1.103s][info   ][gc,phases,start] GC(41) Compaction Phase
[1.123s][info   ][gc,phases      ] GC(41) Compaction Phase 20.432ms
[1.123s][info   ][gc,phases,start] GC(41) Post Compact
[1.124s][info   ][gc,phases      ] GC(41) Post Compact 0.539ms
[1.124s][info   ][gc,heap        ] GC(41) PSYoungGen: 58880K(116736K)->0K(116736K) Eden: 58880K(58880K)->0K(58880K) From: 0K(57856K)->0K(57856K)
[1.124s][info   ][gc,heap        ] GC(41) ParOldGen: 330459K(349696K)->328842K(349696K)
[1.124s][info   ][gc,metaspace   ] GC(41) Metaspace: 224K(4864K)->224K(4864K) NonClass: 212K(4352K)->212K(4352K) Class: 11K(512K)->11K(512K)
[1.124s][info   ][gc             ] GC(41) Pause Full (Ergonomics) 380M->321M(455M) 24.272ms
[1.124s][info   ][gc,cpu         ] GC(41) User=0.09s Sys=0.00s Real=0.02s
????????????: 11633
[1.159s][info   ][gc,heap,exit   ] Heap
[1.159s][info   ][gc,heap,exit   ]  PSYoungGen      total 116736K, used 55684K [0x00000000f5580000, 0x0000000100000000, 0x0000000100000000)
[1.159s][info   ][gc,heap,exit   ]   eden space 58880K, 94% used [0x00000000f5580000,0x00000000f8be1328,0x00000000f8f00000)
[1.159s][info   ][gc,heap,exit   ]   from space 57856K, 0% used [0x00000000fc780000,0x00000000fc780000,0x0000000100000000)
[1.159s][info   ][gc,heap,exit   ]   to   space 57856K, 0% used [0x00000000f8f00000,0x00000000f8f00000,0x00000000fc780000)
[1.159s][info   ][gc,heap,exit   ]  ParOldGen       total 349696K, used 328842K [0x00000000e0000000, 0x00000000f5580000, 0x00000000f5580000)
[1.159s][info   ][gc,heap,exit   ]   object space 349696K, 94% used [0x00000000e0000000,0x00000000f4122830,0x00000000f5580000)
[1.159s][info   ][gc,heap,exit   ]  Metaspace       used 347K, capacity 4508K, committed 4864K, reserved 1056768K
[1.159s][info   ][gc,heap,exit   ]   class space    used 25K, capacity 392K, committed 512K, reserved 1048576K
```
相同条件下切换成并行gc反而gc次数增加，创建的对象个数也有所降低，猜测并行gc为了增加吞吐量，进行简短但多次的gc

3. ZGC
因为装的是jdk15，cms被移除了，很尴尬，换成zgc体验一把
```
[root@0a6ef877d5fa mnt]# java -XX:+UseZGC -Xms512m -Xmx512m -XX:+PrintGCDetails GCLogAnalysis
[0.006s][warning][gc] -XX:+PrintGCDetails is deprecated. Will use -Xlog:gc* instead.
[0.013s][info   ][gc,init] Initializing The Z Garbage Collector
[0.013s][info   ][gc,init] Version: 15.0.1+9-18 (release)
[0.013s][info   ][gc,init] NUMA Support: Disabled
[0.013s][info   ][gc,init] CPUs: 4 total, 4 available
[0.013s][info   ][gc,init] Memory: 1991M
[0.013s][info   ][gc,init] Large Page Support: Disabled
[0.013s][info   ][gc,init] Workers: 3 parallel, 1 concurrent
[0.014s][info   ][gc,init] Address Space Type: Contiguous/Unrestricted/Complete
[0.014s][info   ][gc,init] Address Space Size: 8192M x 3 = 24576M
[0.014s][info   ][gc,init] Heap Backing File: /memfd:java_heap
[0.014s][info   ][gc,init] Heap Backing Filesystem: tmpfs (0x1021994)
[0.015s][info   ][gc,init] Min Capacity: 512M
[0.016s][info   ][gc,init] Initial Capacity: 512M
[0.017s][info   ][gc,init] Max Capacity: 512M
[0.017s][info   ][gc,init] Max Reserve: 22M
[0.018s][info   ][gc,init] Medium Page Size: 16M
[0.019s][info   ][gc,init] Pre-touch: Disabled
[0.019s][info   ][gc,init] Available space on backing filesystem: N/A
[0.020s][info   ][gc,init] Uncommit: Implicitly Disabled (-Xms equals -Xmx)
[0.110s][info   ][gc,init] Runtime Workers: 3 parallel
[0.111s][info   ][gc     ] Using The Z Garbage Collector
[0.114s][info   ][gc,metaspace] CDS archive(s) mapped at: [0x0000000800000000-0x0000000800b26000-0x0000000800b26000), size 11689984, SharedBaseAddress: 0x0000000800000000, ArchiveRelocationMode: 0.
[0.114s][info   ][gc,metaspace] Compressed class space mapped at: 0x0000000800b28000-0x0000000840b28000, size: 1073741824
[0.114s][info   ][gc,metaspace] Narrow klass base: 0x0000000800000000, Narrow klass shift: 3, Narrow klass range: 0x100000000
????...
[0.242s][info   ][gc,start    ] GC(0) Garbage Collection (Warmup)
[0.243s][info   ][gc,phases   ] GC(0) Pause Mark Start 0.377ms
[0.249s][info   ][gc,phases   ] GC(0) Concurrent Mark 5.637ms
[0.251s][info   ][gc,phases   ] GC(0) Pause Mark End 0.594ms
[0.253s][info   ][gc,phases   ] GC(0) Concurrent Process Non-Strong References 1.485ms
[0.253s][info   ][gc,phases   ] GC(0) Concurrent Reset Relocation Set 0.008ms
[0.258s][info   ][gc,phases   ] GC(0) Concurrent Select Relocation Set 4.930ms
[0.260s][info   ][gc,phases   ] GC(0) Pause Relocate Start 0.499ms
[0.271s][info   ][gc,phases   ] GC(0) Concurrent Relocate 10.548ms
[0.272s][info   ][gc,load     ] GC(0) Load: 0.42/0.16/0.11
[0.272s][info   ][gc,mmu      ] GC(0) MMU: 2ms/70.3%, 5ms/88.1%, 10ms/89.1%, 20ms/92.7%, 50ms/97.1%, 100ms/98.5%
[0.272s][info   ][gc,marking  ] GC(0) Mark: 1 stripe(s), 2 proactive flush(es), 1 terminate flush(es), 1 completion(s), 0 continuation(s) 
[0.272s][info   ][gc,nmethod  ] GC(0) NMethods: 108 registered, 0 unregistered
[0.272s][info   ][gc,metaspace] GC(0) Metaspace: 0M used, 4M capacity, 4M committed, 1032M reserved
[0.272s][info   ][gc,ref      ] GC(0) Soft: 6 encountered, 0 discovered, 0 enqueued
[0.272s][info   ][gc,ref      ] GC(0) Weak: 29 encountered, 21 discovered, 6 enqueued
[0.272s][info   ][gc,ref      ] GC(0) Final: 0 encountered, 0 discovered, 0 enqueued
[0.272s][info   ][gc,ref      ] GC(0) Phantom: 1 encountered, 1 discovered, 0 enqueued
[0.272s][info   ][gc,reloc    ] GC(0) Small Pages: 15 / 30M(48%), Empty: 0M(0%), Compacting: 28M(45%)->8M(13%)
[0.272s][info   ][gc,reloc    ] GC(0) Medium Pages: 2 / 32M(52%), Empty: 0M(0%), Compacting: 32M(52%)->16M(26%)
[0.272s][info   ][gc,reloc    ] GC(0) Large Pages: 0 / 0M(0%), Empty: 0M(0%), Compacting: 0M(0%)->0M(0%)
[0.272s][info   ][gc,reloc    ] GC(0) Relocation: Successful
[0.272s][info   ][gc,heap     ] GC(0) Min Capacity: 512M(100%)
[0.272s][info   ][gc,heap     ] GC(0) Max Capacity: 512M(100%)
[0.272s][info   ][gc,heap     ] GC(0) Soft Max Capacity: 512M(100%)
[0.272s][info   ][gc,heap     ] GC(0)                Mark Start          Mark End        Relocate Start      Relocate End           High               Low         
[0.272s][info   ][gc,heap     ] GC(0)  Capacity:      512M (100%)        512M (100%)        512M (100%)        512M (100%)        512M (100%)        512M (100%)   
[0.272s][info   ][gc,heap     ] GC(0)   Reserve:       22M (4%)           22M (4%)           22M (4%)           22M (4%)           22M (4%)           22M (4%)     
[0.272s][info   ][gc,heap     ] GC(0)      Free:      428M (84%)         408M (80%)         404M (79%)         418M (82%)         428M (84%)         386M (75%)    
[0.272s][info   ][gc,heap     ] GC(0)      Used:       62M (12%)          82M (16%)          86M (17%)          72M (14%)         104M (20%)          62M (12%)    
[0.272s][info   ][gc,heap     ] GC(0)      Live:         -                20M (4%)           20M (4%)           20M (4%)             -                  -          
[0.272s][info   ][gc,heap     ] GC(0) Allocated:         -                20M (4%)           24M (5%)           70M (14%)            -                  -          
[0.272s][info   ][gc,heap     ] GC(0)   Garbage:         -                41M (8%)           41M (8%)            5M (1%)             -                  -          
[0.272s][info   ][gc,heap     ] GC(0) Reclaimed:         -                  -                 0M (0%)           36M (7%)             -                  -          
[0.272s][info   ][gc          ] GC(0) Garbage Collection (Warmup) 62M(12%)->72M(14%)
[0.342s][info   ][gc,start    ] GC(1) Garbage Collection (Warmup)
[0.344s][info   ][gc,phases   ] GC(1) Pause Mark Start 0.378ms
[0.349s][info   ][gc,phases   ] GC(1) Concurrent Mark 5.027ms
[0.350s][info   ][gc,phases   ] GC(1) Pause Mark End 0.446ms
[0.352s][info   ][gc,phases   ] GC(1) Concurrent Process Non-Strong References 1.240ms
[0.352s][info   ][gc,phases   ] GC(1) Concurrent Reset Relocation Set 0.008ms
[0.353s][info   ][gc,phases   ] GC(1) Concurrent Select Relocation Set 1.204ms
[0.354s][info   ][gc,phases   ] GC(1) Pause Relocate Start 0.318ms
[0.366s][info   ][gc,phases   ] GC(1) Concurrent Relocate 12.229ms
[0.367s][info   ][gc,load     ] GC(1) Load: 0.42/0.16/0.11
[0.367s][info   ][gc,mmu      ] GC(1) MMU: 2ms/70.3%, 5ms/84.7%, 10ms/89.1%, 20ms/92.7%, 50ms/97.1%, 100ms/98.1%
[0.367s][info   ][gc,marking  ] GC(1) Mark: 1 stripe(s), 2 proactive flush(es), 1 terminate flush(es), 1 completion(s), 0 continuation(s) 
[0.367s][info   ][gc,nmethod  ] GC(1) NMethods: 117 registered, 0 unregistered
[0.367s][info   ][gc,metaspace] GC(1) Metaspace: 0M used, 4M capacity, 4M committed, 1032M reserved
[0.367s][info   ][gc,ref      ] GC(1) Soft: 6 encountered, 0 discovered, 0 enqueued
[0.367s][info   ][gc,ref      ] GC(1) Weak: 23 encountered, 15 discovered, 0 enqueued
[0.367s][info   ][gc,ref      ] GC(1) Final: 0 encountered, 0 discovered, 0 enqueued
[0.367s][info   ][gc,ref      ] GC(1) Phantom: 1 encountered, 1 discovered, 0 enqueued
[0.367s][info   ][gc,reloc    ] GC(1) Small Pages: 40 / 80M(38%), Empty: 0M(0%), Compacting: 76M(37%)->22M(11%)
[0.367s][info   ][gc,reloc    ] GC(1) Medium Pages: 8 / 128M(62%), Empty: 0M(0%), Compacting: 128M(62%)->64M(31%)
[0.367s][info   ][gc,reloc    ] GC(1) Large Pages: 0 / 0M(0%), Empty: 0M(0%), Compacting: 0M(0%)->0M(0%)
[0.367s][info   ][gc,reloc    ] GC(1) Relocation: Successful
[0.367s][info   ][gc,heap     ] GC(1) Min Capacity: 512M(100%)
[0.367s][info   ][gc,heap     ] GC(1) Max Capacity: 512M(100%)
[0.367s][info   ][gc,heap     ] GC(1) Soft Max Capacity: 512M(100%)
[0.367s][info   ][gc,heap     ] GC(1)                Mark Start          Mark End        Relocate Start      Relocate End           High               Low         
[0.367s][info   ][gc,heap     ] GC(1)  Capacity:      512M (100%)        512M (100%)        512M (100%)        512M (100%)        512M (100%)        512M (100%)   
[0.367s][info   ][gc,heap     ] GC(1)   Reserve:       22M (4%)           22M (4%)           22M (4%)           22M (4%)           22M (4%)           22M (4%)     
[0.367s][info   ][gc,heap     ] GC(1)      Free:      282M (55%)         262M (51%)         260M (51%)         346M (68%)         358M (70%)         252M (49%)    
[0.367s][info   ][gc,heap     ] GC(1)      Used:      208M (41%)         228M (45%)         230M (45%)         144M (28%)         238M (46%)         132M (26%)    
[0.367s][info   ][gc,heap     ] GC(1)      Live:         -                76M (15%)          76M (15%)          76M (15%)            -                  -          
[0.367s][info   ][gc,heap     ] GC(1) Allocated:         -                20M (4%)           22M (4%)          140M (27%)            -                  -          
[0.367s][info   ][gc,heap     ] GC(1)   Garbage:         -               131M (26%)         131M (26%)           1M (0%)             -                  -          
[0.367s][info   ][gc,heap     ] GC(1) Reclaimed:         -                  -                 0M (0%)          130M (25%)            -                  -          
[0.367s][info   ][gc          ] GC(1) Garbage Collection (Warmup) 208M(41%)->144M(28%)
[0.442s][info   ][gc,start    ] GC(2) Garbage Collection (Warmup)
[0.443s][info   ][gc,phases   ] GC(2) Pause Mark Start 0.396ms
[0.449s][info   ][gc,phases   ] GC(2) Concurrent Mark 5.394ms
[0.450s][info   ][gc,phases   ] GC(2) Pause Mark End 0.610ms
[0.451s][info   ][gc,phases   ] GC(2) Concurrent Process Non-Strong References 0.999ms
[0.451s][info   ][gc,phases   ] GC(2) Concurrent Reset Relocation Set 0.010ms
[0.453s][info   ][gc,phases   ] GC(2) Concurrent Select Relocation Set 1.225ms
[0.454s][info   ][gc,phases   ] GC(2) Pause Relocate Start 0.477ms
[0.473s][info   ][gc,phases   ] GC(2) Concurrent Relocate 18.648ms
[0.473s][info   ][gc,load     ] GC(2) Load: 0.42/0.16/0.11
[0.473s][info   ][gc,mmu      ] GC(2) MMU: 2ms/69.5%, 5ms/78.3%, 10ms/89.1%, 20ms/92.6%, 50ms/97.0%, 100ms/98.1%
[0.473s][info   ][gc,marking  ] GC(2) Mark: 1 stripe(s), 2 proactive flush(es), 1 terminate flush(es), 1 completion(s), 0 continuation(s) 
[0.473s][info   ][gc,nmethod  ] GC(2) NMethods: 118 registered, 0 unregistered
[0.473s][info   ][gc,metaspace] GC(2) Metaspace: 0M used, 4M capacity, 4M committed, 1032M reserved
[0.473s][info   ][gc,ref      ] GC(2) Soft: 6 encountered, 0 discovered, 0 enqueued
[0.473s][info   ][gc,ref      ] GC(2) Weak: 23 encountered, 15 discovered, 0 enqueued
[0.473s][info   ][gc,ref      ] GC(2) Final: 0 encountered, 0 discovered, 0 enqueued
[0.473s][info   ][gc,ref      ] GC(2) Phantom: 1 encountered, 1 discovered, 0 enqueued
[0.473s][info   ][gc,reloc    ] GC(2) Small Pages: 65 / 130M(40%), Empty: 0M(0%), Compacting: 110M(34%)->32M(10%)
[0.473s][info   ][gc,reloc    ] GC(2) Medium Pages: 12 / 192M(60%), Empty: 0M(0%), Compacting: 176M(55%)->96M(30%)
[0.473s][info   ][gc,reloc    ] GC(2) Large Pages: 0 / 0M(0%), Empty: 0M(0%), Compacting: 0M(0%)->0M(0%)
[0.473s][info   ][gc,reloc    ] GC(2) Relocation: Successful
[0.473s][info   ][gc,heap     ] GC(2) Min Capacity: 512M(100%)
[0.473s][info   ][gc,heap     ] GC(2) Max Capacity: 512M(100%)
[0.473s][info   ][gc,heap     ] GC(2) Soft Max Capacity: 512M(100%)
[0.473s][info   ][gc,heap     ] GC(2)                Mark Start          Mark End        Relocate Start      Relocate End           High               Low         
[0.473s][info   ][gc,heap     ] GC(2)  Capacity:      512M (100%)        512M (100%)        512M (100%)        512M (100%)        512M (100%)        512M (100%)   
[0.473s][info   ][gc,heap     ] GC(2)   Reserve:       22M (4%)           22M (4%)           22M (4%)           22M (4%)           22M (4%)           22M (4%)     
[0.473s][info   ][gc,heap     ] GC(2)      Free:      168M (33%)         148M (29%)         146M (29%)         266M (52%)         282M (55%)         142M (28%)    
[0.473s][info   ][gc,heap     ] GC(2)      Used:      322M (63%)         342M (67%)         344M (67%)         224M (44%)         348M (68%)         208M (41%)    
[0.473s][info   ][gc,heap     ] GC(2)      Live:         -               138M (27%)         138M (27%)         138M (27%)            -                  -          
[0.473s][info   ][gc,heap     ] GC(2) Allocated:         -                20M (4%)           22M (4%)          188M (37%)            -                  -          
[0.473s][info   ][gc,heap     ] GC(2)   Garbage:         -               183M (36%)         183M (36%)           7M (2%)             -                  -          
[0.473s][info   ][gc,heap     ] GC(2) Reclaimed:         -                  -                 0M (0%)          176M (34%)            -                  -          
[0.473s][info   ][gc          ] GC(2) Garbage Collection (Warmup) 322M(63%)->224M(44%)
[0.542s][info   ][gc,start    ] GC(3) Garbage Collection (Allocation Rate)
[0.543s][info   ][gc,phases   ] GC(3) Pause Mark Start 0.502ms
[0.549s][info   ][gc,phases   ] GC(3) Concurrent Mark 5.779ms
[0.550s][info   ][gc,phases   ] GC(3) Pause Mark End 0.320ms
[0.552s][info   ][gc,phases   ] GC(3) Concurrent Process Non-Strong References 1.417ms
[0.552s][info   ][gc,phases   ] GC(3) Concurrent Reset Relocation Set 0.011ms
[0.553s][info   ][gc,phases   ] GC(3) Concurrent Select Relocation Set 1.288ms
[0.555s][info   ][gc,phases   ] GC(3) Pause Relocate Start 0.487ms
[0.569s][info   ][gc,phases   ] GC(3) Concurrent Relocate 13.656ms
[0.569s][info   ][gc,load     ] GC(3) Load: 0.42/0.16/0.11
[0.569s][info   ][gc,mmu      ] GC(3) MMU: 2ms/69.5%, 5ms/78.3%, 10ms/89.1%, 20ms/92.6%, 50ms/97.0%, 100ms/98.1%
[0.569s][info   ][gc,marking  ] GC(3) Mark: 1 stripe(s), 2 proactive flush(es), 1 terminate flush(es), 0 completion(s), 0 continuation(s) 
[0.569s][info   ][gc,nmethod  ] GC(3) NMethods: 119 registered, 0 unregistered
[0.569s][info   ][gc,metaspace] GC(3) Metaspace: 0M used, 4M capacity, 4M committed, 1032M reserved
[0.569s][info   ][gc,ref      ] GC(3) Soft: 6 encountered, 0 discovered, 0 enqueued
[0.569s][info   ][gc,ref      ] GC(3) Weak: 23 encountered, 14 discovered, 0 enqueued
[0.569s][info   ][gc,ref      ] GC(3) Final: 0 encountered, 0 discovered, 0 enqueued
[0.569s][info   ][gc,ref      ] GC(3) Phantom: 1 encountered, 1 discovered, 0 enqueued
[0.569s][info   ][gc,reloc    ] GC(3) Small Pages: 86 / 172M(40%), Empty: 0M(0%), Compacting: 146M(34%)->46M(11%)
[0.569s][info   ][gc,reloc    ] GC(3) Medium Pages: 16 / 256M(60%), Empty: 0M(0%), Compacting: 144M(34%)->64M(15%)
[0.569s][info   ][gc,reloc    ] GC(3) Large Pages: 0 / 0M(0%), Empty: 0M(0%), Compacting: 0M(0%)->0M(0%)
[0.569s][info   ][gc,reloc    ] GC(3) Relocation: Successful
[0.569s][info   ][gc,heap     ] GC(3) Min Capacity: 512M(100%)
[0.569s][info   ][gc,heap     ] GC(3) Max Capacity: 512M(100%)
[0.569s][info   ][gc,heap     ] GC(3) Soft Max Capacity: 512M(100%)
[0.569s][info   ][gc,heap     ] GC(3)                Mark Start          Mark End        Relocate Start      Relocate End           High               Low         
[0.569s][info   ][gc,heap     ] GC(3)  Capacity:      512M (100%)        512M (100%)        512M (100%)        512M (100%)        512M (100%)        512M (100%)   
[0.569s][info   ][gc,heap     ] GC(3)   Reserve:       22M (4%)           22M (4%)           22M (4%)           22M (4%)           22M (4%)           22M (4%)     
[0.569s][info   ][gc,heap     ] GC(3)      Free:       62M (12%)          42M (8%)           40M (8%)          190M (37%)         196M (38%)          36M (7%)     
[0.569s][info   ][gc,heap     ] GC(3)      Used:      428M (84%)         448M (88%)         450M (88%)         300M (59%)         454M (89%)         294M (57%)    
[0.569s][info   ][gc,heap     ] GC(3)      Live:         -               192M (38%)         192M (38%)         192M (38%)            -                  -          
[0.569s][info   ][gc,heap     ] GC(3) Allocated:         -                20M (4%)           22M (4%)          162M (32%)            -                  -          
[0.569s][info   ][gc,heap     ] GC(3)   Garbage:         -               235M (46%)         235M (46%)          37M (7%)             -                  -          
[0.569s][info   ][gc,heap     ] GC(3) Reclaimed:         -                  -                 0M (0%)          198M (39%)            -                  -          
[0.569s][info   ][gc          ] GC(3) Garbage Collection (Allocation Rate) 428M(84%)->300M(59%)
[0.638s][info   ][gc,start    ] GC(4) Garbage Collection (Allocation Stall)
[0.638s][info   ][gc,ref      ] GC(4) Clearing All SoftReferences
[0.639s][info   ][gc,phases   ] GC(4) Pause Mark Start 0.929ms
[0.644s][info   ][gc,phases   ] GC(4) Concurrent Mark 4.235ms
[0.645s][info   ][gc,phases   ] GC(4) Pause Mark End 0.265ms
[0.646s][info   ][gc,phases   ] GC(4) Concurrent Process Non-Strong References 1.319ms
[0.646s][info   ][gc,phases   ] GC(4) Concurrent Reset Relocation Set 0.007ms
[0.649s][info   ][gc,phases   ] GC(4) Concurrent Select Relocation Set 2.159ms
[0.649s][info   ][gc,phases   ] GC(4) Pause Relocate Start 0.311ms
[0.654s][info   ][gc          ] Allocation Stall (main) 16.870ms
[0.663s][info   ][gc,phases   ] GC(4) Concurrent Relocate 13.386ms
[0.663s][info   ][gc,load     ] GC(4) Load: 0.42/0.16/0.11
[0.663s][info   ][gc,mmu      ] GC(4) MMU: 2ms/53.6%, 5ms/78.3%, 10ms/88.1%, 20ms/92.5%, 50ms/97.0%, 100ms/97.7%
[0.663s][info   ][gc,marking  ] GC(4) Mark: 2 stripe(s), 1 proactive flush(es), 1 terminate flush(es), 0 completion(s), 0 continuation(s) 
[0.663s][info   ][gc,nmethod  ] GC(4) NMethods: 119 registered, 0 unregistered
[0.663s][info   ][gc,metaspace] GC(4) Metaspace: 0M used, 4M capacity, 4M committed, 1032M reserved
[0.663s][info   ][gc,ref      ] GC(4) Soft: 6 encountered, 6 discovered, 6 enqueued
[0.663s][info   ][gc,ref      ] GC(4) Weak: 23 encountered, 17 discovered, 0 enqueued
[0.663s][info   ][gc,ref      ] GC(4) Final: 0 encountered, 0 discovered, 0 enqueued
[0.663s][info   ][gc,ref      ] GC(4) Phantom: 1 encountered, 1 discovered, 0 enqueued
[0.663s][info   ][gc,reloc    ] GC(4) Small Pages: 87 / 174M(36%), Empty: 0M(0%), Compacting: 130M(27%)->42M(9%)
[0.663s][info   ][gc,reloc    ] GC(4) Medium Pages: 19 / 304M(64%), Empty: 0M(0%), Compacting: 240M(50%)->128M(27%)
[0.664s][info   ][gc,reloc    ] GC(4) Large Pages: 0 / 0M(0%), Empty: 0M(0%), Compacting: 0M(0%)->0M(0%)
[0.664s][info   ][gc,reloc    ] GC(4) Relocation: Successful
[0.664s][info   ][gc,heap     ] GC(4) Min Capacity: 512M(100%)
[0.664s][info   ][gc,heap     ] GC(4) Max Capacity: 512M(100%)
[0.664s][info   ][gc,heap     ] GC(4) Soft Max Capacity: 512M(100%)
[0.664s][info   ][gc,heap     ] GC(4)                Mark Start          Mark End        Relocate Start      Relocate End           High               Low         
[0.664s][info   ][gc,heap     ] GC(4)  Capacity:      512M (100%)        512M (100%)        512M (100%)        512M (100%)        512M (100%)        512M (100%)   
[0.664s][info   ][gc,heap     ] GC(4)   Reserve:       22M (4%)           22M (4%)           22M (4%)           22M (4%)           22M (4%)           16M (3%)     
[0.664s][info   ][gc,heap     ] GC(4)      Free:       12M (2%)           12M (2%)           12M (2%)          196M (38%)         196M (38%)           0M (0%)     
[0.664s][info   ][gc,heap     ] GC(4)      Used:      478M (93%)         478M (93%)         478M (93%)         294M (57%)         496M (97%)         294M (57%)    
[0.664s][info   ][gc,heap     ] GC(4)      Live:         -               224M (44%)         224M (44%)         224M (44%)            -                  -          
[0.664s][info   ][gc,heap     ] GC(4) Allocated:         -                 0M (0%)            0M (0%)          186M (36%)            -                  -          
[0.664s][info   ][gc,heap     ] GC(4)   Garbage:         -               253M (49%)         253M (49%)          37M (7%)             -                  -          
[0.664s][info   ][gc,heap     ] GC(4) Reclaimed:         -                  -                 0M (0%)          216M (42%)            -                  -          
[0.665s][info   ][gc          ] GC(4) Garbage Collection (Allocation Stall) 478M(93%)->294M(57%)
[0.709s][info   ][gc,start    ] GC(5) Garbage Collection (Allocation Stall)
[0.709s][info   ][gc,ref      ] GC(5) Clearing All SoftReferences
[0.710s][info   ][gc,phases   ] GC(5) Pause Mark Start 0.695ms
[0.715s][info   ][gc,phases   ] GC(5) Concurrent Mark 5.206ms
[0.716s][info   ][gc,phases   ] GC(5) Pause Mark End 0.363ms
[0.718s][info   ][gc,phases   ] GC(5) Concurrent Process Non-Strong References 1.525ms
[0.718s][info   ][gc,phases   ] GC(5) Concurrent Reset Relocation Set 0.015ms
[0.721s][info   ][gc,phases   ] GC(5) Concurrent Select Relocation Set 2.418ms
[0.722s][info   ][gc,phases   ] GC(5) Pause Relocate Start 0.503ms
[0.727s][info   ][gc          ] Allocation Stall (main) 18.755ms
[0.732s][info   ][gc,phases   ] GC(5) Concurrent Relocate 10.195ms
[0.732s][info   ][gc,load     ] GC(5) Load: 0.42/0.16/0.11
[0.732s][info   ][gc,mmu      ] GC(5) MMU: 2ms/53.6%, 5ms/78.3%, 10ms/88.1%, 20ms/92.2%, 50ms/96.9%, 100ms/96.9%
[0.732s][info   ][gc,marking  ] GC(5) Mark: 2 stripe(s), 1 proactive flush(es), 1 terminate flush(es), 0 completion(s), 0 continuation(s) 
[0.732s][info   ][gc,nmethod  ] GC(5) NMethods: 121 registered, 0 unregistered
[0.732s][info   ][gc,metaspace] GC(5) Metaspace: 0M used, 4M capacity, 4M committed, 1032M reserved
[0.732s][info   ][gc,ref      ] GC(5) Soft: 0 encountered, 0 discovered, 0 enqueued
[0.732s][info   ][gc,ref      ] GC(5) Weak: 23 encountered, 2 discovered, 0 enqueued
[0.732s][info   ][gc,ref      ] GC(5) Final: 0 encountered, 0 discovered, 0 enqueued
[0.732s][info   ][gc,ref      ] GC(5) Phantom: 1 encountered, 0 discovered, 0 enqueued
[0.732s][info   ][gc,reloc    ] GC(5) Small Pages: 94 / 188M(39%), Empty: 0M(0%), Compacting: 134M(28%)->48M(10%)
[0.732s][info   ][gc,reloc    ] GC(5) Medium Pages: 18 / 288M(61%), Empty: 0M(0%), Compacting: 176M(37%)->96M(20%)
[0.732s][info   ][gc,reloc    ] GC(5) Large Pages: 0 / 0M(0%), Empty: 0M(0%), Compacting: 0M(0%)->0M(0%)
[0.733s][info   ][gc,reloc    ] GC(5) Relocation: Successful
[0.733s][info   ][gc,heap     ] GC(5) Min Capacity: 512M(100%)
[0.733s][info   ][gc,heap     ] GC(5) Max Capacity: 512M(100%)
[0.733s][info   ][gc,heap     ] GC(5) Soft Max Capacity: 512M(100%)
[0.733s][info   ][gc,heap     ] GC(5)                Mark Start          Mark End        Relocate Start      Relocate End           High               Low         
[0.733s][info   ][gc,heap     ] GC(5)  Capacity:      512M (100%)        512M (100%)        512M (100%)        512M (100%)        512M (100%)        512M (100%)   
[0.733s][info   ][gc,heap     ] GC(5)   Reserve:       22M (4%)           22M (4%)           22M (4%)           22M (4%)           22M (4%)           20M (4%)     
[0.733s][info   ][gc,heap     ] GC(5)      Free:       14M (3%)           14M (3%)           14M (3%)          172M (34%)         174M (34%)           0M (0%)     
[0.733s][info   ][gc,heap     ] GC(5)      Used:      476M (93%)         476M (93%)         476M (93%)         318M (62%)         492M (96%)         316M (62%)    
[0.733s][info   ][gc,heap     ] GC(5)      Live:         -               243M (47%)         243M (47%)         243M (47%)            -                  -          
[0.733s][info   ][gc,heap     ] GC(5) Allocated:         -                 0M (0%)            0M (0%)          152M (30%)            -                  -          
[0.733s][info   ][gc,heap     ] GC(5)   Garbage:         -               232M (45%)         232M (45%)          82M (16%)            -                  -          
[0.734s][info   ][gc,heap     ] GC(5) Reclaimed:         -                  -                 0M (0%)          150M (29%)            -                  -          
[0.734s][info   ][gc          ] GC(5) Garbage Collection (Allocation Stall) 476M(93%)->318M(62%)
[0.742s][info   ][gc,start    ] GC(6) Garbage Collection (Allocation Rate)
[0.743s][info   ][gc,phases   ] GC(6) Pause Mark Start 0.305ms
[0.750s][info   ][gc,phases   ] GC(6) Concurrent Mark 5.660ms
[0.751s][info   ][gc,phases   ] GC(6) Pause Mark End 0.547ms
[0.752s][info   ][gc,phases   ] GC(6) Concurrent Process Non-Strong References 1.358ms
[0.752s][info   ][gc,phases   ] GC(6) Concurrent Reset Relocation Set 0.011ms
[0.755s][info   ][gc,phases   ] GC(6) Concurrent Select Relocation Set 2.733ms
[0.756s][info   ][gc,phases   ] GC(6) Pause Relocate Start 0.395ms
[0.763s][info   ][gc,phases   ] GC(6) Concurrent Relocate 6.627ms
[0.763s][info   ][gc,load     ] GC(6) Load: 0.42/0.16/0.11
[0.764s][info   ][gc,mmu      ] GC(6) MMU: 2ms/53.6%, 5ms/78.3%, 10ms/88.1%, 20ms/92.2%, 50ms/94.4%, 100ms/96.9%
[0.764s][info   ][gc,marking  ] GC(6) Mark: 1 stripe(s), 2 proactive flush(es), 1 terminate flush(es), 1 completion(s), 0 continuation(s) 
[0.764s][info   ][gc,nmethod  ] GC(6) NMethods: 121 registered, 0 unregistered
[0.764s][info   ][gc,metaspace] GC(6) Metaspace: 0M used, 4M capacity, 4M committed, 1032M reserved
[0.764s][info   ][gc,ref      ] GC(6) Soft: 0 encountered, 0 discovered, 0 enqueued
[0.764s][info   ][gc,ref      ] GC(6) Weak: 23 encountered, 15 discovered, 0 enqueued
[0.764s][info   ][gc,ref      ] GC(6) Final: 0 encountered, 0 discovered, 0 enqueued
[0.764s][info   ][gc,ref      ] GC(6) Phantom: 1 encountered, 1 discovered, 0 enqueued
[0.764s][info   ][gc,reloc    ] GC(6) Small Pages: 64 / 128M(35%), Empty: 0M(0%), Compacting: 46M(12%)->20M(5%)
[0.764s][info   ][gc,reloc    ] GC(6) Medium Pages: 15 / 240M(65%), Empty: 0M(0%), Compacting: 96M(26%)->64M(17%)
[0.764s][info   ][gc,reloc    ] GC(6) Large Pages: 0 / 0M(0%), Empty: 0M(0%), Compacting: 0M(0%)->0M(0%)
[0.764s][info   ][gc,reloc    ] GC(6) Relocation: Successful
[0.764s][info   ][gc,heap     ] GC(6) Min Capacity: 512M(100%)
[0.764s][info   ][gc,heap     ] GC(6) Max Capacity: 512M(100%)
[0.765s][info   ][gc,heap     ] GC(6) Soft Max Capacity: 512M(100%)
[0.765s][info   ][gc,heap     ] GC(6)                Mark Start          Mark End        Relocate Start      Relocate End           High               Low         
[0.765s][info   ][gc,heap     ] GC(6)  Capacity:      512M (100%)        512M (100%)        512M (100%)        512M (100%)        512M (100%)        512M (100%)   
[0.765s][info   ][gc,heap     ] GC(6)   Reserve:       22M (4%)           22M (4%)           22M (4%)           22M (4%)           22M (4%)           22M (4%)     
[0.765s][info   ][gc,heap     ] GC(6)      Free:      122M (24%)         102M (20%)          98M (19%)         128M (25%)         138M (27%)          80M (16%)    
[0.765s][info   ][gc,heap     ] GC(6)      Used:      368M (72%)         388M (76%)         392M (77%)         362M (71%)         410M (80%)         352M (69%)    
[0.765s][info   ][gc,heap     ] GC(6)      Live:         -               255M (50%)         255M (50%)         255M (50%)            -                  -          
[0.766s][info   ][gc,heap     ] GC(6) Allocated:         -                20M (4%)           24M (5%)          136M (27%)            -                  -          
[0.766s][info   ][gc,heap     ] GC(6)   Garbage:         -               112M (22%)         112M (22%)          36M (7%)             -                  -          
[0.766s][info   ][gc,heap     ] GC(6) Reclaimed:         -                  -                 0M (0%)           76M (15%)            -                  -          
[0.766s][info   ][gc          ] GC(6) Garbage Collection (Allocation Rate) 368M(72%)->362M(71%)
[0.792s][info   ][gc,start    ] GC(7) Garbage Collection (Allocation Stall)
[0.793s][info   ][gc,ref      ] GC(7) Clearing All SoftReferences
[0.794s][info   ][gc,phases   ] GC(7) Pause Mark Start 0.966ms
[0.798s][info   ][gc,phases   ] GC(7) Concurrent Mark 4.200ms
[0.799s][info   ][gc,phases   ] GC(7) Pause Mark End 0.639ms
[0.800s][info   ][gc,phases   ] GC(7) Concurrent Process Non-Strong References 1.307ms
[0.800s][info   ][gc,phases   ] GC(7) Concurrent Reset Relocation Set 0.009ms
[0.802s][info   ][gc,phases   ] GC(7) Concurrent Select Relocation Set 1.292ms
[0.802s][info   ][gc,phases   ] GC(7) Pause Relocate Start 0.435ms
[0.808s][info   ][gc          ] Allocation Stall (main) 15.585ms
[0.812s][info   ][gc,phases   ] GC(7) Concurrent Relocate 9.241ms
[0.812s][info   ][gc,load     ] GC(7) Load: 0.42/0.16/0.11
[0.812s][info   ][gc,mmu      ] GC(7) MMU: 2ms/51.7%, 5ms/78.3%, 10ms/79.6%, 20ms/89.8%, 50ms/94.4%, 100ms/95.2%
[0.812s][info   ][gc,marking  ] GC(7) Mark: 2 stripe(s), 2 proactive flush(es), 1 terminate flush(es), 0 completion(s), 0 continuation(s) 
[0.813s][info   ][gc,nmethod  ] GC(7) NMethods: 121 registered, 0 unregistered
[0.813s][info   ][gc,metaspace] GC(7) Metaspace: 0M used, 4M capacity, 4M committed, 1032M reserved
[0.813s][info   ][gc,ref      ] GC(7) Soft: 0 encountered, 0 discovered, 0 enqueued
[0.813s][info   ][gc,ref      ] GC(7) Weak: 23 encountered, 14 discovered, 0 enqueued
[0.813s][info   ][gc,ref      ] GC(7) Final: 0 encountered, 0 discovered, 0 enqueued
[0.813s][info   ][gc,ref      ] GC(7) Phantom: 1 encountered, 0 discovered, 0 enqueued
[0.813s][info   ][gc,reloc    ] GC(7) Small Pages: 91 / 182M(37%), Empty: 0M(0%), Compacting: 130M(27%)->56M(12%)
[0.813s][info   ][gc,reloc    ] GC(7) Medium Pages: 19 / 304M(63%), Empty: 0M(0%), Compacting: 192M(40%)->112M(23%)
[0.813s][info   ][gc,reloc    ] GC(7) Large Pages: 0 / 0M(0%), Empty: 0M(0%), Compacting: 0M(0%)->0M(0%)
[0.814s][info   ][gc,reloc    ] GC(7) Relocation: Successful
[0.814s][info   ][gc,heap     ] GC(7) Min Capacity: 512M(100%)
[0.814s][info   ][gc,heap     ] GC(7) Max Capacity: 512M(100%)
[0.814s][info   ][gc,heap     ] GC(7) Soft Max Capacity: 512M(100%)
[0.814s][info   ][gc,heap     ] GC(7)                Mark Start          Mark End        Relocate Start      Relocate End           High               Low         
[0.814s][info   ][gc,heap     ] GC(7)  Capacity:      512M (100%)        512M (100%)        512M (100%)        512M (100%)        512M (100%)        512M (100%)   
[0.814s][info   ][gc,heap     ] GC(7)   Reserve:       22M (4%)           22M (4%)           22M (4%)           22M (4%)           22M (4%)            8M (2%)     
[0.815s][info   ][gc,heap     ] GC(7)      Free:        4M (1%)            4M (1%)            4M (1%)          154M (30%)         154M (30%)           0M (0%)     
[0.815s][info   ][gc,heap     ] GC(7)      Used:      486M (95%)         486M (95%)         486M (95%)         336M (66%)         504M (98%)         336M (66%)    
[0.815s][info   ][gc,heap     ] GC(7)      Live:         -               271M (53%)         271M (53%)         271M (53%)            -                  -          
[0.815s][info   ][gc,heap     ] GC(7) Allocated:         -                 0M (0%)            0M (0%)          172M (34%)            -                  -          
[0.815s][info   ][gc,heap     ] GC(7)   Garbage:         -               214M (42%)         214M (42%)          56M (11%)            -                  -          
[0.816s][info   ][gc,heap     ] GC(7) Reclaimed:         -                  -                 0M (0%)          158M (31%)            -                  -          
[0.816s][info   ][gc          ] GC(7) Garbage Collection (Allocation Stall) 486M(95%)->336M(66%)
[0.842s][info   ][gc,start    ] GC(8) Garbage Collection (Allocation Rate)
[0.843s][info   ][gc,phases   ] GC(8) Pause Mark Start 0.407ms
[0.857s][info   ][gc,phases   ] GC(8) Concurrent Mark 13.181ms
[0.858s][info   ][gc,phases   ] GC(8) Pause Mark End 0.606ms
[0.860s][info   ][gc,phases   ] GC(8) Concurrent Process Non-Strong References 1.674ms
[0.860s][info   ][gc,phases   ] GC(8) Concurrent Reset Relocation Set 0.015ms
[0.861s][info   ][gc,phases   ] GC(8) Concurrent Select Relocation Set 1.393ms
[0.862s][info   ][gc,phases   ] GC(8) Pause Relocate Start 0.403ms
[0.872s][info   ][gc          ] Allocation Stall (main) 10.392ms
[0.873s][info   ][gc,phases   ] GC(8) Concurrent Relocate 10.747ms
[0.873s][info   ][gc,load     ] GC(8) Load: 0.42/0.16/0.11
[0.873s][info   ][gc,mmu      ] GC(8) MMU: 2ms/51.7%, 5ms/78.3%, 10ms/79.6%, 20ms/89.8%, 50ms/94.4%, 100ms/95.2%
[0.873s][info   ][gc,marking  ] GC(8) Mark: 1 stripe(s), 2 proactive flush(es), 1 terminate flush(es), 1 completion(s), 0 continuation(s) 
[0.873s][info   ][gc,nmethod  ] GC(8) NMethods: 121 registered, 0 unregistered
[0.873s][info   ][gc,metaspace] GC(8) Metaspace: 0M used, 4M capacity, 4M committed, 1032M reserved
[0.874s][info   ][gc,ref      ] GC(8) Soft: 0 encountered, 0 discovered, 0 enqueued
[0.874s][info   ][gc,ref      ] GC(8) Weak: 23 encountered, 15 discovered, 0 enqueued
[0.874s][info   ][gc,ref      ] GC(8) Final: 0 encountered, 0 discovered, 0 enqueued
[0.874s][info   ][gc,ref      ] GC(8) Phantom: 1 encountered, 1 discovered, 0 enqueued
[0.874s][info   ][gc,reloc    ] GC(8) Small Pages: 85 / 170M(37%), Empty: 0M(0%), Compacting: 96M(21%)->36M(8%)
[0.874s][info   ][gc,reloc    ] GC(8) Medium Pages: 18 / 288M(63%), Empty: 0M(0%), Compacting: 160M(35%)->96M(21%)
[0.874s][info   ][gc,reloc    ] GC(8) Large Pages: 0 / 0M(0%), Empty: 0M(0%), Compacting: 0M(0%)->0M(0%)
[0.874s][info   ][gc,reloc    ] GC(8) Relocation: Successful
[0.874s][info   ][gc,heap     ] GC(8) Min Capacity: 512M(100%)
[0.874s][info   ][gc,heap     ] GC(8) Max Capacity: 512M(100%)
[0.874s][info   ][gc,heap     ] GC(8) Soft Max Capacity: 512M(100%)
[0.875s][info   ][gc,heap     ] GC(8)                Mark Start          Mark End        Relocate Start      Relocate End           High               Low         
[0.875s][info   ][gc,heap     ] GC(8)  Capacity:      512M (100%)        512M (100%)        512M (100%)        512M (100%)        512M (100%)        512M (100%)   
[0.875s][info   ][gc,heap     ] GC(8)   Reserve:       22M (4%)           22M (4%)           22M (4%)           22M (4%)           22M (4%)            6M (1%)     
[0.875s][info   ][gc,heap     ] GC(8)      Free:       32M (6%)            4M (1%)            0M (0%)          124M (24%)         126M (25%)           0M (0%)     
[0.876s][info   ][gc,heap     ] GC(8)      Used:      458M (89%)         486M (95%)         490M (96%)         366M (71%)         506M (99%)         364M (71%)    
[0.876s][info   ][gc,heap     ] GC(8)      Live:         -               268M (52%)         268M (52%)         268M (52%)            -                  -          
[0.876s][info   ][gc,heap     ] GC(8) Allocated:         -                28M (5%)           32M (6%)          164M (32%)            -                  -          
[0.876s][info   ][gc,heap     ] GC(8)   Garbage:         -               189M (37%)         189M (37%)          63M (12%)            -                  -          
[0.876s][info   ][gc,heap     ] GC(8) Reclaimed:         -                  -                 0M (0%)          126M (25%)            -                  -          
[0.876s][info   ][gc          ] GC(8) Garbage Collection (Allocation Rate) 458M(89%)->366M(71%)
[0.902s][info   ][gc,start    ] GC(9) Garbage Collection (Allocation Stall)
[0.903s][info   ][gc,ref      ] GC(9) Clearing All SoftReferences
[0.903s][info   ][gc,phases   ] GC(9) Pause Mark Start 0.714ms
[0.908s][info   ][gc,phases   ] GC(9) Concurrent Mark 3.860ms
[0.908s][info   ][gc,phases   ] GC(9) Pause Mark End 0.265ms
[0.910s][info   ][gc,phases   ] GC(9) Concurrent Process Non-Strong References 1.385ms
[0.910s][info   ][gc,phases   ] GC(9) Concurrent Reset Relocation Set 0.011ms
[0.912s][info   ][gc,phases   ] GC(9) Concurrent Select Relocation Set 1.383ms
[0.912s][info   ][gc,phases   ] GC(9) Pause Relocate Start 0.582ms
[0.915s][info   ][gc          ] Allocation Stall (main) 12.569ms
[0.921s][info   ][gc,phases   ] GC(9) Concurrent Relocate 7.980ms
[0.921s][info   ][gc,load     ] GC(9) Load: 0.42/0.16/0.11
[0.921s][info   ][gc,mmu      ] GC(9) MMU: 2ms/51.7%, 5ms/78.3%, 10ms/79.6%, 20ms/89.8%, 50ms/94.4%, 100ms/95.2%
[0.921s][info   ][gc,marking  ] GC(9) Mark: 2 stripe(s), 1 proactive flush(es), 1 terminate flush(es), 0 completion(s), 0 continuation(s) 
[0.921s][info   ][gc,nmethod  ] GC(9) NMethods: 121 registered, 0 unregistered
[0.921s][info   ][gc,metaspace] GC(9) Metaspace: 0M used, 4M capacity, 4M committed, 1032M reserved
[0.921s][info   ][gc,ref      ] GC(9) Soft: 0 encountered, 0 discovered, 0 enqueued
[0.921s][info   ][gc,ref      ] GC(9) Weak: 23 encountered, 12 discovered, 0 enqueued
[0.921s][info   ][gc,ref      ] GC(9) Final: 0 encountered, 0 discovered, 0 enqueued
[0.921s][info   ][gc,ref      ] GC(9) Phantom: 1 encountered, 1 discovered, 0 enqueued
[0.922s][info   ][gc,reloc    ] GC(9) Small Pages: 91 / 182M(37%), Empty: 0M(0%), Compacting: 102M(21%)->38M(8%)
[0.922s][info   ][gc,reloc    ] GC(9) Medium Pages: 19 / 304M(63%), Empty: 0M(0%), Compacting: 144M(30%)->80M(16%)
[0.922s][info   ][gc,reloc    ] GC(9) Large Pages: 0 / 0M(0%), Empty: 0M(0%), Compacting: 0M(0%)->0M(0%)
[0.922s][info   ][gc,reloc    ] GC(9) Relocation: Successful
[0.922s][info   ][gc,heap     ] GC(9) Min Capacity: 512M(100%)
[0.922s][info   ][gc,heap     ] GC(9) Max Capacity: 512M(100%)
[0.922s][info   ][gc,heap     ] GC(9) Soft Max Capacity: 512M(100%)
[0.923s][info   ][gc,heap     ] GC(9)                Mark Start          Mark End        Relocate Start      Relocate End           High               Low         
[0.923s][info   ][gc,heap     ] GC(9)  Capacity:      512M (100%)        512M (100%)        512M (100%)        512M (100%)        512M (100%)        512M (100%)   
[0.923s][info   ][gc,heap     ] GC(9)   Reserve:       22M (4%)           22M (4%)           22M (4%)           22M (4%)           22M (4%)            8M (2%)     
[0.923s][info   ][gc,heap     ] GC(9)      Free:        4M (1%)            4M (1%)            4M (1%)          112M (22%)         118M (23%)           0M (0%)     
[0.923s][info   ][gc,heap     ] GC(9)      Used:      486M (95%)         486M (95%)         486M (95%)         378M (74%)         504M (98%)         372M (73%)    
[0.923s][info   ][gc,heap     ] GC(9)      Live:         -               284M (55%)         284M (55%)         284M (55%)            -                  -          
[0.923s][info   ][gc,heap     ] GC(9) Allocated:         -                 0M (0%)            0M (0%)          138M (27%)            -                  -          
[0.923s][info   ][gc,heap     ] GC(9)   Garbage:         -               201M (39%)         201M (39%)          57M (11%)            -                  -          
[0.923s][info   ][gc,heap     ] GC(9) Reclaimed:         -                  -                 0M (0%)          144M (28%)            -                  -          
[0.924s][info   ][gc          ] GC(9) Garbage Collection (Allocation Stall) 486M(95%)->378M(74%)
[0.942s][info   ][gc,start    ] GC(10) Garbage Collection (Allocation Rate)
[0.942s][info   ][gc,phases   ] GC(10) Pause Mark Start 0.419ms
[0.948s][info   ][gc,phases   ] GC(10) Concurrent Mark 5.131ms
[0.949s][info   ][gc,phases   ] GC(10) Pause Mark End 0.734ms
[0.950s][info   ][gc,phases   ] GC(10) Concurrent Process Non-Strong References 1.121ms
[0.950s][info   ][gc,phases   ] GC(10) Concurrent Reset Relocation Set 0.012ms
[0.952s][info   ][gc,phases   ] GC(10) Concurrent Select Relocation Set 1.293ms
[0.953s][info   ][gc,phases   ] GC(10) Pause Relocate Start 0.780ms
[0.953s][info   ][gc          ] Allocation Stall (main) 6.350ms
[0.956s][info   ][gc          ] Allocation Stall (main) 1.006ms
[0.962s][info   ][gc,phases   ] GC(10) Concurrent Relocate 9.133ms
[0.963s][info   ][gc,load     ] GC(10) Load: 0.42/0.16/0.11
[0.963s][info   ][gc,mmu      ] GC(10) MMU: 2ms/51.7%, 5ms/69.7%, 10ms/79.6%, 20ms/89.8%, 50ms/93.0%, 100ms/95.2%
[0.963s][info   ][gc,marking  ] GC(10) Mark: 1 stripe(s), 2 proactive flush(es), 1 terminate flush(es), 1 completion(s), 0 continuation(s) 
[0.963s][info   ][gc,nmethod  ] GC(10) NMethods: 122 registered, 0 unregistered
[0.963s][info   ][gc,metaspace] GC(10) Metaspace: 0M used, 4M capacity, 4M committed, 1032M reserved
[0.963s][info   ][gc,ref      ] GC(10) Soft: 0 encountered, 0 discovered, 0 enqueued
[0.963s][info   ][gc,ref      ] GC(10) Weak: 23 encountered, 15 discovered, 0 enqueued
[0.963s][info   ][gc,ref      ] GC(10) Final: 0 encountered, 0 discovered, 0 enqueued
[0.963s][info   ][gc,ref      ] GC(10) Phantom: 1 encountered, 1 discovered, 0 enqueued
[0.963s][info   ][gc,reloc    ] GC(10) Small Pages: 82 / 164M(35%), Empty: 0M(0%), Compacting: 86M(18%)->38M(8%)
[0.963s][info   ][gc,reloc    ] GC(10) Medium Pages: 19 / 304M(65%), Empty: 0M(0%), Compacting: 96M(21%)->48M(10%)
[0.963s][info   ][gc,reloc    ] GC(10) Large Pages: 0 / 0M(0%), Empty: 0M(0%), Compacting: 0M(0%)->0M(0%)
[0.963s][info   ][gc,reloc    ] GC(10) Relocation: Successful
[0.963s][info   ][gc,heap     ] GC(10) Min Capacity: 512M(100%)
[0.963s][info   ][gc,heap     ] GC(10) Max Capacity: 512M(100%)
[0.963s][info   ][gc,heap     ] GC(10) Soft Max Capacity: 512M(100%)
[0.963s][info   ][gc,heap     ] GC(10)                Mark Start          Mark End        Relocate Start      Relocate End           High               Low         
[0.963s][info   ][gc,heap     ] GC(10)  Capacity:      512M (100%)        512M (100%)        512M (100%)        512M (100%)        512M (100%)        512M (100%)   
[0.963s][info   ][gc,heap     ] GC(10)   Reserve:       22M (4%)           22M (4%)           22M (4%)           22M (4%)           22M (4%)           20M (4%)     
[0.963s][info   ][gc,heap     ] GC(10)      Free:       22M (4%)            0M (0%)            0M (0%)           68M (13%)          82M (16%)           0M (0%)     
[0.963s][info   ][gc,heap     ] GC(10)      Used:      468M (91%)         490M (96%)         490M (96%)         422M (82%)         492M (96%)         408M (80%)    
[0.963s][info   ][gc,heap     ] GC(10)      Live:         -               292M (57%)         292M (57%)         292M (57%)            -                  -          
[0.963s][info   ][gc,heap     ] GC(10) Allocated:         -                22M (4%)           22M (4%)          136M (27%)            -                  -          
[0.963s][info   ][gc,heap     ] GC(10)   Garbage:         -               175M (34%)         175M (34%)          79M (15%)            -                  -          
[0.963s][info   ][gc,heap     ] GC(10) Reclaimed:         -                  -                 0M (0%)           96M (19%)            -                  -          
[0.963s][info   ][gc          ] GC(10) Garbage Collection (Allocation Rate) 468M(91%)->422M(82%)
[0.981s][info   ][gc,start    ] GC(11) Garbage Collection (Allocation Stall)
[0.981s][info   ][gc,ref      ] GC(11) Clearing All SoftReferences
[0.982s][info   ][gc,phases   ] GC(11) Pause Mark Start 0.754ms
[0.987s][info   ][gc,phases   ] GC(11) Concurrent Mark 4.294ms
[0.987s][info   ][gc,phases   ] GC(11) Pause Mark End 0.450ms
[0.988s][info   ][gc,phases   ] GC(11) Concurrent Process Non-Strong References 0.995ms
[0.988s][info   ][gc,phases   ] GC(11) Concurrent Reset Relocation Set 0.011ms
[0.990s][info   ][gc,phases   ] GC(11) Concurrent Select Relocation Set 1.387ms
[0.991s][info   ][gc,phases   ] GC(11) Pause Relocate Start 0.667ms
[0.993s][info   ][gc          ] Allocation Stall (main) 12.790ms
[1.004s][info   ][gc,phases   ] GC(11) Concurrent Relocate 12.821ms
[1.004s][info   ][gc,load     ] GC(11) Load: 0.42/0.16/0.11
[1.004s][info   ][gc,mmu      ] GC(11) MMU: 2ms/51.7%, 5ms/69.7%, 10ms/79.6%, 20ms/89.8%, 50ms/92.4%, 100ms/94.6%
[1.004s][info   ][gc,marking  ] GC(11) Mark: 2 stripe(s), 1 proactive flush(es), 1 terminate flush(es), 0 completion(s), 0 continuation(s) 
[1.004s][info   ][gc,nmethod  ] GC(11) NMethods: 122 registered, 0 unregistered
[1.004s][info   ][gc,metaspace] GC(11) Metaspace: 0M used, 4M capacity, 4M committed, 1032M reserved
[1.005s][info   ][gc,ref      ] GC(11) Soft: 0 encountered, 0 discovered, 0 enqueued
[1.005s][info   ][gc,ref      ] GC(11) Weak: 23 encountered, 17 discovered, 0 enqueued
[1.005s][info   ][gc,ref      ] GC(11) Final: 0 encountered, 0 discovered, 0 enqueued
[1.005s][info   ][gc,ref      ] GC(11) Phantom: 1 encountered, 1 discovered, 0 enqueued
[1.005s][info   ][gc,reloc    ] GC(11) Small Pages: 84 / 168M(34%), Empty: 0M(0%), Compacting: 84M(17%)->36M(7%)
[1.006s][info   ][gc,reloc    ] GC(11) Medium Pages: 20 / 320M(66%), Empty: 0M(0%), Compacting: 160M(33%)->96M(20%)
[1.006s][info   ][gc,reloc    ] GC(11) Large Pages: 0 / 0M(0%), Empty: 0M(0%), Compacting: 0M(0%)->0M(0%)
[1.006s][info   ][gc,reloc    ] GC(11) Relocation: Incomplete
[1.007s][info   ][gc,heap     ] GC(11) Min Capacity: 512M(100%)
[1.007s][info   ][gc,heap     ] GC(11) Max Capacity: 512M(100%)
[1.007s][info   ][gc,heap     ] GC(11) Soft Max Capacity: 512M(100%)
[1.007s][info   ][gc,heap     ] GC(11)                Mark Start          Mark End        Relocate Start      Relocate End           High               Low         
[1.007s][info   ][gc,heap     ] GC(11)  Capacity:      512M (100%)        512M (100%)        512M (100%)        512M (100%)        512M (100%)        512M (100%)   
[1.007s][info   ][gc,heap     ] GC(11)   Reserve:       22M (4%)           22M (4%)           22M (4%)           22M (4%)           22M (4%)            4M (1%)     
[1.007s][info   ][gc,heap     ] GC(11)      Free:        2M (0%)            2M (0%)            2M (0%)           50M (10%)          50M (10%)           0M (0%)     
[1.007s][info   ][gc,heap     ] GC(11)      Used:      488M (95%)         488M (95%)         488M (95%)         440M (86%)         508M (99%)         440M (86%)    
[1.007s][info   ][gc,heap     ] GC(11)      Live:         -               297M (58%)         297M (58%)         297M (58%)            -                  -          
[1.008s][info   ][gc,heap     ] GC(11) Allocated:         -                 0M (0%)            0M (0%)           52M (10%)            -                  -          
[1.008s][info   ][gc,heap     ] GC(11)   Garbage:         -               190M (37%)         190M (37%)         140M (27%)            -                  -          
[1.009s][info   ][gc,heap     ] GC(11) Reclaimed:         -                  -                 0M (0%)           50M (10%)            -                  -          
[1.009s][info   ][gc          ] GC(11) Garbage Collection (Allocation Stall) 488M(95%)->440M(86%)
[1.019s][info   ][gc,start    ] GC(12) Garbage Collection (Allocation Stall)
[1.020s][info   ][gc,ref      ] GC(12) Clearing All SoftReferences
[1.020s][info   ][gc,phases   ] GC(12) Pause Mark Start 0.483ms
[1.024s][info   ][gc,phases   ] GC(12) Concurrent Mark 2.807ms
[1.025s][info   ][gc,phases   ] GC(12) Pause Mark End 0.355ms
[1.026s][info   ][gc,phases   ] GC(12) Concurrent Process Non-Strong References 0.863ms
[1.026s][info   ][gc,phases   ] GC(12) Concurrent Reset Relocation Set 0.011ms
[1.027s][info   ][gc,phases   ] GC(12) Concurrent Select Relocation Set 1.358ms
[1.028s][info   ][gc,phases   ] GC(12) Pause Relocate Start 0.258ms
[1.030s][info   ][gc          ] Allocation Stall (main) 11.136ms
[1.033s][info   ][gc,phases   ] GC(12) Concurrent Relocate 4.902ms
[1.033s][info   ][gc          ] Allocation Stall (main) 2.466ms
[1.033s][info   ][gc,load     ] GC(12) Load: 0.42/0.16/0.11
[1.033s][info   ][gc,mmu      ] GC(12) MMU: 2ms/51.7%, 5ms/69.7%, 10ms/79.6%, 20ms/89.8%, 50ms/92.4%, 100ms/94.6%
[1.033s][info   ][gc,marking  ] GC(12) Mark: 2 stripe(s), 1 proactive flush(es), 1 terminate flush(es), 0 completion(s), 0 continuation(s) 
[1.034s][info   ][gc,nmethod  ] GC(12) NMethods: 122 registered, 0 unregistered
[1.034s][info   ][gc,metaspace] GC(12) Metaspace: 0M used, 4M capacity, 4M committed, 1032M reserved
[1.034s][info   ][gc,ref      ] GC(12) Soft: 0 encountered, 0 discovered, 0 enqueued
[1.034s][info   ][gc,ref      ] GC(12) Weak: 23 encountered, 17 discovered, 0 enqueued
[1.034s][info   ][gc,ref      ] GC(12) Final: 0 encountered, 0 discovered, 0 enqueued
[1.034s][info   ][gc,ref      ] GC(12) Phantom: 1 encountered, 1 discovered, 0 enqueued
[1.034s][info   ][gc,reloc    ] GC(12) Small Pages: 69 / 138M(28%), Empty: 0M(0%), Compacting: 34M(7%)->14M(3%)
[1.034s][info   ][gc,reloc    ] GC(12) Medium Pages: 22 / 352M(72%), Empty: 0M(0%), Compacting: 224M(46%)->128M(26%)
[1.034s][info   ][gc,reloc    ] GC(12) Large Pages: 0 / 0M(0%), Empty: 0M(0%), Compacting: 0M(0%)->0M(0%)
[1.034s][info   ][gc,reloc    ] GC(12) Relocation: Incomplete
[1.034s][info   ][gc,heap     ] GC(12) Min Capacity: 512M(100%)
[1.035s][info   ][gc,heap     ] GC(12) Max Capacity: 512M(100%)
[1.035s][info   ][gc,heap     ] GC(12) Soft Max Capacity: 512M(100%)
[1.035s][info   ][gc,heap     ] GC(12)                Mark Start          Mark End        Relocate Start      Relocate End           High               Low         
[1.035s][info   ][gc,heap     ] GC(12)  Capacity:      512M (100%)        512M (100%)        512M (100%)        512M (100%)        512M (100%)        512M (100%)   
[1.035s][info   ][gc,heap     ] GC(12)   Reserve:       22M (4%)           22M (4%)           22M (4%)           22M (4%)           22M (4%)            2M (0%)     
[1.035s][info   ][gc,heap     ] GC(12)      Free:        0M (0%)            0M (0%)            0M (0%)            0M (0%)           16M (3%)            0M (0%)     
[1.035s][info   ][gc,heap     ] GC(12)      Used:      490M (96%)         490M (96%)         490M (96%)         490M (96%)         510M (100%)        474M (93%)    
[1.035s][info   ][gc,heap     ] GC(12)      Live:         -               299M (59%)         299M (59%)         299M (59%)            -                  -          
[1.035s][info   ][gc,heap     ] GC(12) Allocated:         -                 0M (0%)            0M (0%)           50M (10%)            -                  -          
[1.035s][info   ][gc,heap     ] GC(12)   Garbage:         -               190M (37%)         190M (37%)         172M (34%)            -                  -          
[1.035s][info   ][gc,heap     ] GC(12) Reclaimed:         -                  -                 0M (0%)           18M (4%)             -                  -          
[1.036s][info   ][gc          ] GC(12) Garbage Collection (Allocation Stall) 490M(96%)->490M(96%)
[1.042s][info   ][gc,start    ] GC(13) Garbage Collection (Allocation Rate)
[1.043s][info   ][gc,phases   ] GC(13) Pause Mark Start 0.220ms
[1.047s][info   ][gc,phases   ] GC(13) Concurrent Mark 3.771ms
[1.048s][info   ][gc,phases   ] GC(13) Pause Mark End 0.519ms
[1.048s][info   ][gc,phases   ] GC(13) Concurrent Process Non-Strong References 0.734ms
[1.049s][info   ][gc,phases   ] GC(13) Concurrent Reset Relocation Set 0.061ms
[1.051s][info   ][gc,phases   ] GC(13) Concurrent Select Relocation Set 2.213ms
[1.052s][info   ][gc,phases   ] GC(13) Pause Relocate Start 0.431ms
[1.056s][info   ][gc          ] Allocation Stall (main) 12.023ms
[1.066s][info   ][gc,phases   ] GC(13) Concurrent Relocate 13.804ms
[1.066s][info   ][gc,load     ] GC(13) Load: 0.42/0.16/0.11
[1.066s][info   ][gc,mmu      ] GC(13) MMU: 2ms/51.7%, 5ms/69.7%, 10ms/79.6%, 20ms/89.8%, 50ms/92.4%, 100ms/94.6%
[1.066s][info   ][gc,marking  ] GC(13) Mark: 1 stripe(s), 2 proactive flush(es), 1 terminate flush(es), 1 completion(s), 0 continuation(s) 
[1.066s][info   ][gc,nmethod  ] GC(13) NMethods: 122 registered, 0 unregistered
[1.066s][info   ][gc,metaspace] GC(13) Metaspace: 0M used, 4M capacity, 4M committed, 1032M reserved
[1.066s][info   ][gc,ref      ] GC(13) Soft: 0 encountered, 0 discovered, 0 enqueued
[1.067s][info   ][gc,ref      ] GC(13) Weak: 23 encountered, 15 discovered, 0 enqueued
[1.067s][info   ][gc,ref      ] GC(13) Final: 0 encountered, 0 discovered, 0 enqueued
[1.067s][info   ][gc,ref      ] GC(13) Phantom: 1 encountered, 1 discovered, 0 enqueued
[1.067s][info   ][gc,reloc    ] GC(13) Small Pages: 66 / 132M(27%), Empty: 2M(0%), Compacting: 16M(3%)->4M(1%)
[1.067s][info   ][gc,reloc    ] GC(13) Medium Pages: 22 / 352M(73%), Empty: 0M(0%), Compacting: 224M(46%)->128M(26%)
[1.067s][info   ][gc,reloc    ] GC(13) Large Pages: 0 / 0M(0%), Empty: 0M(0%), Compacting: 0M(0%)->0M(0%)
[1.067s][info   ][gc,reloc    ] GC(13) Relocation: Successful
[1.067s][info   ][gc,heap     ] GC(13) Min Capacity: 512M(100%)
[1.067s][info   ][gc,heap     ] GC(13) Max Capacity: 512M(100%)
[1.067s][info   ][gc,heap     ] GC(13) Soft Max Capacity: 512M(100%)
[1.067s][info   ][gc,heap     ] GC(13)                Mark Start          Mark End        Relocate Start      Relocate End           High               Low         
[1.067s][info   ][gc,heap     ] GC(13)  Capacity:      512M (100%)        512M (100%)        512M (100%)        512M (100%)        512M (100%)        512M (100%)   
[1.067s][info   ][gc,heap     ] GC(13)   Reserve:       22M (4%)           22M (4%)           22M (4%)           22M (4%)           22M (4%)           12M (2%)     
[1.067s][info   ][gc,heap     ] GC(13)      Free:        6M (1%)            4M (1%)            6M (1%)           80M (16%)          80M (16%)           0M (0%)     
[1.067s][info   ][gc,heap     ] GC(13)      Used:      484M (95%)         486M (95%)         484M (95%)         410M (80%)         500M (98%)         410M (80%)    
[1.067s][info   ][gc,heap     ] GC(13)      Live:         -               298M (58%)         298M (58%)         298M (58%)            -                  -          
[1.067s][info   ][gc,heap     ] GC(13) Allocated:         -                 2M (0%)            2M (0%)          168M (33%)            -                  -          
[1.067s][info   ][gc,heap     ] GC(13)   Garbage:         -               185M (36%)         183M (36%)          43M (9%)             -                  -          
[1.067s][info   ][gc,heap     ] GC(13) Reclaimed:         -                  -                 2M (0%)          142M (28%)            -                  -          
[1.067s][info   ][gc          ] GC(13) Garbage Collection (Allocation Rate) 484M(95%)->410M(80%)
[1.083s][info   ][gc,start    ] GC(14) Garbage Collection (Allocation Stall)
[1.083s][info   ][gc,ref      ] GC(14) Clearing All SoftReferences
[1.084s][info   ][gc,phases   ] GC(14) Pause Mark Start 0.738ms
[1.087s][info   ][gc,phases   ] GC(14) Concurrent Mark 2.947ms
[1.088s][info   ][gc,phases   ] GC(14) Pause Mark End 0.407ms
[1.090s][info   ][gc,phases   ] GC(14) Concurrent Process Non-Strong References 1.564ms
[1.090s][info   ][gc,phases   ] GC(14) Concurrent Reset Relocation Set 0.006ms
[1.092s][info   ][gc,phases   ] GC(14) Concurrent Select Relocation Set 2.178ms
[1.093s][info   ][gc,phases   ] GC(14) Pause Relocate Start 0.576ms
[1.096s][info   ][gc          ] Allocation Stall (main) 13.732ms
[1.099s][info   ][gc,phases   ] GC(14) Concurrent Relocate 5.572ms
[1.099s][info   ][gc,load     ] GC(14) Load: 0.42/0.16/0.11
[1.099s][info   ][gc,mmu      ] GC(14) MMU: 2ms/51.7%, 5ms/69.7%, 10ms/79.6%, 20ms/89.8%, 50ms/92.4%, 100ms/94.6%
[1.099s][info   ][gc,marking  ] GC(14) Mark: 2 stripe(s), 1 proactive flush(es), 1 terminate flush(es), 0 completion(s), 0 continuation(s) 
[1.099s][info   ][gc,nmethod  ] GC(14) NMethods: 122 registered, 0 unregistered
[1.099s][info   ][gc,metaspace] GC(14) Metaspace: 0M used, 4M capacity, 4M committed, 1032M reserved
[1.099s][info   ][gc,ref      ] GC(14) Soft: 0 encountered, 0 discovered, 0 enqueued
[1.099s][info   ][gc,ref      ] GC(14) Weak: 23 encountered, 17 discovered, 0 enqueued
[1.099s][info   ][gc,ref      ] GC(14) Final: 0 encountered, 0 discovered, 0 enqueued
[1.099s][info   ][gc,ref      ] GC(14) Phantom: 1 encountered, 1 discovered, 0 enqueued
[1.100s][info   ][gc,reloc    ] GC(14) Small Pages: 86 / 172M(36%), Empty: 0M(0%), Compacting: 80M(17%)->34M(7%)
[1.100s][info   ][gc,reloc    ] GC(14) Medium Pages: 19 / 304M(64%), Empty: 0M(0%), Compacting: 80M(17%)->48M(10%)
[1.100s][info   ][gc,reloc    ] GC(14) Large Pages: 0 / 0M(0%), Empty: 0M(0%), Compacting: 0M(0%)->0M(0%)
[1.100s][info   ][gc,reloc    ] GC(14) Relocation: Successful
[1.100s][info   ][gc,heap     ] GC(14) Min Capacity: 512M(100%)
[1.100s][info   ][gc,heap     ] GC(14) Max Capacity: 512M(100%)
[1.100s][info   ][gc,heap     ] GC(14) Soft Max Capacity: 512M(100%)
[1.100s][info   ][gc,heap     ] GC(14)                Mark Start          Mark End        Relocate Start      Relocate End           High               Low         
[1.100s][info   ][gc,heap     ] GC(14)  Capacity:      512M (100%)        512M (100%)        512M (100%)        512M (100%)        512M (100%)        512M (100%)   
[1.101s][info   ][gc,heap     ] GC(14)   Reserve:       22M (4%)           22M (4%)           22M (4%)           22M (4%)           22M (4%)           20M (4%)     
[1.101s][info   ][gc,heap     ] GC(14)      Free:       14M (3%)           14M (3%)           14M (3%)           74M (14%)          76M (15%)           0M (0%)     
[1.101s][info   ][gc,heap     ] GC(14)      Used:      476M (93%)         476M (93%)         476M (93%)         416M (81%)         492M (96%)         414M (81%)    
[1.101s][info   ][gc,heap     ] GC(14)      Live:         -               305M (60%)         305M (60%)         305M (60%)            -                  -          
[1.101s][info   ][gc,heap     ] GC(14) Allocated:         -                 0M (0%)            0M (0%)          100M (20%)            -                  -          
[1.101s][info   ][gc,heap     ] GC(14)   Garbage:         -               170M (33%)         170M (33%)          90M (18%)            -                  -          
[1.101s][info   ][gc,heap     ] GC(14) Reclaimed:         -                  -                 0M (0%)           80M (16%)            -                  -          
[1.101s][info   ][gc          ] GC(14) Garbage Collection (Allocation Stall) 476M(93%)->416M(81%)
[1.114s][info   ][gc,start    ] GC(15) Garbage Collection (Allocation Stall)
[1.115s][info   ][gc,ref      ] GC(15) Clearing All SoftReferences
[1.115s][info   ][gc,phases   ] GC(15) Pause Mark Start 0.631ms
[1.119s][info   ][gc,phases   ] GC(15) Concurrent Mark 2.908ms
[1.119s][info   ][gc,phases   ] GC(15) Pause Mark End 0.260ms
[1.121s][info   ][gc,phases   ] GC(15) Concurrent Process Non-Strong References 1.438ms
[1.121s][info   ][gc,phases   ] GC(15) Concurrent Reset Relocation Set 0.013ms
[1.122s][info   ][gc,phases   ] GC(15) Concurrent Select Relocation Set 1.302ms
[1.124s][info   ][gc,phases   ] GC(15) Pause Relocate Start 0.357ms
[1.128s][info   ][gc          ] Allocation Stall (main) 13.642ms
[1.136s][info   ][gc,phases   ] GC(15) Concurrent Relocate 11.976ms
[1.136s][info   ][gc,load     ] GC(15) Load: 0.42/0.16/0.11
[1.136s][info   ][gc,mmu      ] GC(15) MMU: 2ms/51.7%, 5ms/69.7%, 10ms/79.6%, 20ms/89.8%, 50ms/92.4%, 100ms/94.6%
[1.136s][info   ][gc,marking  ] GC(15) Mark: 2 stripe(s), 1 proactive flush(es), 1 terminate flush(es), 0 completion(s), 0 continuation(s) 
[1.136s][info   ][gc,nmethod  ] GC(15) NMethods: 122 registered, 0 unregistered
[1.136s][info   ][gc,metaspace] GC(15) Metaspace: 0M used, 4M capacity, 4M committed, 1032M reserved
[1.136s][info   ][gc,ref      ] GC(15) Soft: 0 encountered, 0 discovered, 0 enqueued
[1.136s][info   ][gc,ref      ] GC(15) Weak: 23 encountered, 17 discovered, 0 enqueued
[1.136s][info   ][gc,ref      ] GC(15) Final: 0 encountered, 0 discovered, 0 enqueued
[1.136s][info   ][gc,ref      ] GC(15) Phantom: 1 encountered, 1 discovered, 0 enqueued
[1.136s][info   ][gc,reloc    ] GC(15) Small Pages: 78 / 156M(33%), Empty: 0M(0%), Compacting: 60M(13%)->28M(6%)
[1.136s][info   ][gc,reloc    ] GC(15) Medium Pages: 20 / 320M(67%), Empty: 0M(0%), Compacting: 160M(34%)->96M(20%)
[1.136s][info   ][gc,reloc    ] GC(15) Large Pages: 0 / 0M(0%), Empty: 0M(0%), Compacting: 0M(0%)->0M(0%)
[1.136s][info   ][gc,reloc    ] GC(15) Relocation: Successful
[1.136s][info   ][gc,heap     ] GC(15) Min Capacity: 512M(100%)
[1.136s][info   ][gc,heap     ] GC(15) Max Capacity: 512M(100%)
[1.136s][info   ][gc,heap     ] GC(15) Soft Max Capacity: 512M(100%)
[1.136s][info   ][gc,heap     ] GC(15)                Mark Start          Mark End        Relocate Start      Relocate End           High               Low         
[1.136s][info   ][gc,heap     ] GC(15)  Capacity:      512M (100%)        512M (100%)        512M (100%)        512M (100%)        512M (100%)        512M (100%)   
[1.136s][info   ][gc,heap     ] GC(15)   Reserve:       22M (4%)           22M (4%)           22M (4%)           22M (4%)           22M (4%)           12M (2%)     
[1.136s][info   ][gc,heap     ] GC(15)      Free:       14M (3%)           14M (3%)           14M (3%)           76M (15%)          76M (15%)           0M (0%)     
[1.136s][info   ][gc,heap     ] GC(15)      Used:      476M (93%)         476M (93%)         476M (93%)         414M (81%)         500M (98%)         414M (81%)    
[1.137s][info   ][gc,heap     ] GC(15)      Live:         -               307M (60%)         307M (60%)         307M (60%)            -                  -          
[1.137s][info   ][gc,heap     ] GC(15) Allocated:         -                 0M (0%)            0M (0%)          158M (31%)            -                  -          
[1.137s][info   ][gc,heap     ] GC(15)   Garbage:         -               168M (33%)         168M (33%)          72M (14%)            -                  -          
[1.137s][info   ][gc,heap     ] GC(15) Reclaimed:         -                  -                 0M (0%)           96M (19%)            -                  -          
[1.137s][info   ][gc          ] GC(15) Garbage Collection (Allocation Stall) 476M(93%)->414M(81%)
[1.142s][info   ][gc,start    ] GC(16) Garbage Collection (Allocation Rate)
[1.143s][info   ][gc,phases   ] GC(16) Pause Mark Start 0.324ms
[1.148s][info   ][gc,phases   ] GC(16) Concurrent Mark 4.285ms
[1.149s][info   ][gc,phases   ] GC(16) Pause Mark End 0.232ms
[1.151s][info   ][gc,phases   ] GC(16) Concurrent Process Non-Strong References 1.745ms
[1.151s][info   ][gc,phases   ] GC(16) Concurrent Reset Relocation Set 0.007ms
[1.153s][info   ][gc,phases   ] GC(16) Concurrent Select Relocation Set 1.286ms
[1.154s][info   ][gc,phases   ] GC(16) Pause Relocate Start 0.318ms
[1.157s][info   ][gc,phases   ] GC(16) Concurrent Relocate 2.783ms
[1.157s][info   ][gc,load     ] GC(16) Load: 0.42/0.16/0.11
[1.157s][info   ][gc,mmu      ] GC(16) MMU: 2ms/51.7%, 5ms/69.7%, 10ms/79.6%, 20ms/89.8%, 50ms/92.4%, 100ms/94.6%
[1.157s][info   ][gc,marking  ] GC(16) Mark: 1 stripe(s), 2 proactive flush(es), 1 terminate flush(es), 1 completion(s), 0 continuation(s) 
[1.157s][info   ][gc,nmethod  ] GC(16) NMethods: 122 registered, 0 unregistered
[1.157s][info   ][gc,metaspace] GC(16) Metaspace: 0M used, 4M capacity, 4M committed, 1032M reserved
[1.157s][info   ][gc,ref      ] GC(16) Soft: 0 encountered, 0 discovered, 0 enqueued
[1.157s][info   ][gc,ref      ] GC(16) Weak: 23 encountered, 15 discovered, 0 enqueued
[1.157s][info   ][gc,ref      ] GC(16) Final: 0 encountered, 0 discovered, 0 enqueued
[1.157s][info   ][gc,ref      ] GC(16) Phantom: 1 encountered, 1 discovered, 0 enqueued
[1.157s][info   ][gc,reloc    ] GC(16) Small Pages: 77 / 154M(35%), Empty: 0M(0%), Compacting: 46M(10%)->18M(4%)
[1.157s][info   ][gc,reloc    ] GC(16) Medium Pages: 18 / 288M(65%), Empty: 0M(0%), Compacting: 32M(7%)->16M(4%)
[1.157s][info   ][gc,reloc    ] GC(16) Large Pages: 0 / 0M(0%), Empty: 0M(0%), Compacting: 0M(0%)->0M(0%)
[1.157s][info   ][gc,reloc    ] GC(16) Relocation: Successful
[1.157s][info   ][gc,heap     ] GC(16) Min Capacity: 512M(100%)
[1.157s][info   ][gc,heap     ] GC(16) Max Capacity: 512M(100%)
[1.157s][info   ][gc,heap     ] GC(16) Soft Max Capacity: 512M(100%)
[1.157s][info   ][gc,heap     ] GC(16)                Mark Start          Mark End        Relocate Start      Relocate End           High               Low         
[1.157s][info   ][gc,heap     ] GC(16)  Capacity:      512M (100%)        512M (100%)        512M (100%)        512M (100%)        512M (100%)        512M (100%)   
[1.157s][info   ][gc,heap     ] GC(16)   Reserve:       22M (4%)           22M (4%)           22M (4%)           22M (4%)           22M (4%)           22M (4%)     
[1.157s][info   ][gc,heap     ] GC(16)      Free:       48M (9%)           24M (5%)           22M (4%)           60M (12%)          60M (12%)          16M (3%)     
[1.157s][info   ][gc,heap     ] GC(16)      Used:      442M (86%)         466M (91%)         468M (91%)         430M (84%)         474M (93%)         430M (84%)    
[1.157s][info   ][gc,heap     ] GC(16)      Live:         -               307M (60%)         307M (60%)         307M (60%)            -                  -          
[1.157s][info   ][gc,heap     ] GC(16) Allocated:         -                24M (5%)           26M (5%)           66M (13%)            -                  -          
[1.157s][info   ][gc,heap     ] GC(16)   Garbage:         -               134M (26%)         134M (26%)          90M (18%)            -                  -          
[1.157s][info   ][gc,heap     ] GC(16) Reclaimed:         -                  -                 0M (0%)           44M (9%)             -                  -          
[1.157s][info   ][gc          ] GC(16) Garbage Collection (Allocation Rate) 442M(86%)->430M(84%)
[1.170s][info   ][gc,start    ] GC(17) Garbage Collection (Allocation Stall)
[1.170s][info   ][gc,ref      ] GC(17) Clearing All SoftReferences
[1.171s][info   ][gc,phases   ] GC(17) Pause Mark Start 0.838ms
[1.177s][info   ][gc,phases   ] GC(17) Concurrent Mark 5.261ms
[1.178s][info   ][gc,phases   ] GC(17) Pause Mark End 0.412ms
[1.179s][info   ][gc,phases   ] GC(17) Concurrent Process Non-Strong References 1.032ms
[1.179s][info   ][gc,phases   ] GC(17) Concurrent Reset Relocation Set 0.010ms
[1.180s][info   ][gc,phases   ] GC(17) Concurrent Select Relocation Set 1.249ms
[1.181s][info   ][gc,phases   ] GC(17) Pause Relocate Start 0.333ms
[1.184s][info   ][gc          ] Allocation Stall (main) 14.596ms
[1.185s][info   ][gc,phases   ] GC(17) Concurrent Relocate 3.337ms
[1.185s][info   ][gc,load     ] GC(17) Load: 0.42/0.16/0.11
[1.185s][info   ][gc,mmu      ] GC(17) MMU: 2ms/51.7%, 5ms/69.7%, 10ms/79.6%, 20ms/89.8%, 50ms/92.4%, 100ms/94.6%
[1.185s][info   ][gc,marking  ] GC(17) Mark: 2 stripe(s), 2 proactive flush(es), 1 terminate flush(es), 0 completion(s), 0 continuation(s) 
[1.185s][info   ][gc,nmethod  ] GC(17) NMethods: 122 registered, 0 unregistered
[1.185s][info   ][gc,metaspace] GC(17) Metaspace: 0M used, 4M capacity, 4M committed, 1032M reserved
[1.185s][info   ][gc,ref      ] GC(17) Soft: 0 encountered, 0 discovered, 0 enqueued
[1.185s][info   ][gc,ref      ] GC(17) Weak: 23 encountered, 14 discovered, 0 enqueued
[1.185s][info   ][gc,ref      ] GC(17) Final: 0 encountered, 0 discovered, 0 enqueued
[1.185s][info   ][gc,ref      ] GC(17) Phantom: 1 encountered, 0 discovered, 0 enqueued
[1.185s][info   ][gc,reloc    ] GC(17) Small Pages: 85 / 170M(35%), Empty: 0M(0%), Compacting: 64M(13%)->26M(5%)
[1.185s][info   ][gc,reloc    ] GC(17) Medium Pages: 20 / 320M(65%), Empty: 0M(0%), Compacting: 128M(26%)->80M(16%)
[1.185s][info   ][gc,reloc    ] GC(17) Large Pages: 0 / 0M(0%), Empty: 0M(0%), Compacting: 0M(0%)->0M(0%)
[1.185s][info   ][gc,reloc    ] GC(17) Relocation: Incomplete
[1.186s][info   ][gc,heap     ] GC(17) Min Capacity: 512M(100%)
[1.186s][info   ][gc,heap     ] GC(17) Max Capacity: 512M(100%)
[1.186s][info   ][gc,heap     ] GC(17) Soft Max Capacity: 512M(100%)
[1.186s][info   ][gc,heap     ] GC(17)                Mark Start          Mark End        Relocate Start      Relocate End           High               Low         
[1.186s][info   ][gc,heap     ] GC(17)  Capacity:      512M (100%)        512M (100%)        512M (100%)        512M (100%)        512M (100%)        512M (100%)   
[1.186s][info   ][gc,heap     ] GC(17)   Reserve:       22M (4%)           22M (4%)           22M (4%)           22M (4%)           22M (4%)            4M (1%)     
[1.186s][info   ][gc,heap     ] GC(17)      Free:        0M (0%)            0M (0%)            0M (0%)            6M (1%)           16M (3%)            0M (0%)     
[1.186s][info   ][gc,heap     ] GC(17)      Used:      490M (96%)         490M (96%)         490M (96%)         484M (95%)         508M (99%)         474M (93%)    
[1.186s][info   ][gc,heap     ] GC(17)      Live:         -               310M (61%)         310M (61%)         310M (61%)            -                  -          
[1.186s][info   ][gc,heap     ] GC(17) Allocated:         -                 0M (0%)            0M (0%)           58M (11%)            -                  -          
[1.187s][info   ][gc,heap     ] GC(17)   Garbage:         -               179M (35%)         179M (35%)         157M (31%)            -                  -          
[1.187s][info   ][gc,heap     ] GC(17) Reclaimed:         -                  -                 0M (0%)           22M (4%)             -                  -          
[1.187s][info   ][gc          ] GC(17) Garbage Collection (Allocation Stall) 490M(96%)->484M(95%)
[1.242s][info   ][gc,start    ] GC(18) Garbage Collection (Allocation Rate)
[1.245s][info   ][gc,phases   ] GC(18) Pause Mark Start 0.444ms
[1.254s][info   ][gc,phases   ] GC(18) Concurrent Mark 8.670ms
[1.258s][info   ][gc,phases   ] GC(18) Pause Mark End 0.429ms
[1.261s][info   ][gc,phases   ] GC(18) Concurrent Process Non-Strong References 2.261ms
[1.261s][info   ][gc,phases   ] GC(18) Concurrent Reset Relocation Set 0.008ms
[1.262s][info   ][gc,phases   ] GC(18) Concurrent Select Relocation Set 1.565ms
[1.266s][info   ][gc,phases   ] GC(18) Pause Relocate Start 0.540ms
[1.298s][info   ][gc,phases   ] GC(18) Concurrent Relocate 31.910ms
[1.298s][info   ][gc,load     ] GC(18) Load: 0.42/0.16/0.11
[1.298s][info   ][gc,mmu      ] GC(18) MMU: 2ms/51.7%, 5ms/69.7%, 10ms/79.6%, 20ms/89.8%, 50ms/92.4%, 100ms/94.6%
[1.298s][info   ][gc,marking  ] GC(18) Mark: 1 stripe(s), 2 proactive flush(es), 2 terminate flush(es), 1 completion(s), 0 continuation(s) 
[1.298s][info   ][gc,nmethod  ] GC(18) NMethods: 137 registered, 0 unregistered
[1.298s][info   ][gc,metaspace] GC(18) Metaspace: 0M used, 4M capacity, 4M committed, 1032M reserved
[1.298s][info   ][gc,ref      ] GC(18) Soft: 1 encountered, 0 discovered, 0 enqueued
[1.298s][info   ][gc,ref      ] GC(18) Weak: 34 encountered, 26 discovered, 1 enqueued
[1.298s][info   ][gc,ref      ] GC(18) Final: 0 encountered, 0 discovered, 0 enqueued
[1.298s][info   ][gc,ref      ] GC(18) Phantom: 1 encountered, 1 discovered, 0 enqueued
[1.298s][info   ][gc,reloc    ] GC(18) Small Pages: 67 / 134M(28%), Empty: 0M(0%), Compacting: 12M(2%)->6M(1%)
[1.298s][info   ][gc,reloc    ] GC(18) Medium Pages: 22 / 352M(72%), Empty: 0M(0%), Compacting: 144M(30%)->64M(13%)
[1.298s][info   ][gc,reloc    ] GC(18) Large Pages: 0 / 0M(0%), Empty: 0M(0%), Compacting: 0M(0%)->0M(0%)
[1.299s][info   ][gc,reloc    ] GC(18) Relocation: Successful
[1.299s][info   ][gc,heap     ] GC(18) Min Capacity: 512M(100%)
[1.299s][info   ][gc,heap     ] GC(18) Max Capacity: 512M(100%)
[1.299s][info   ][gc,heap     ] GC(18) Soft Max Capacity: 512M(100%)
[1.299s][info   ][gc,heap     ] GC(18)                Mark Start          Mark End        Relocate Start      Relocate End           High               Low         
[1.299s][info   ][gc,heap     ] GC(18)  Capacity:      512M (100%)        512M (100%)        512M (100%)        512M (100%)        512M (100%)        512M (100%)   
[1.299s][info   ][gc,heap     ] GC(18)   Reserve:       22M (4%)           22M (4%)           22M (4%)           22M (4%)           22M (4%)            6M (1%)     
[1.299s][info   ][gc,heap     ] GC(18)      Free:        4M (1%)            2M (0%)            2M (0%)           88M (17%)          88M (17%)           0M (0%)     
[1.299s][info   ][gc,heap     ] GC(18)      Used:      486M (95%)         488M (95%)         488M (95%)         402M (79%)         506M (99%)         402M (79%)    
[1.299s][info   ][gc,heap     ] GC(18)      Live:         -               311M (61%)         311M (61%)         311M (61%)            -                  -          
[1.299s][info   ][gc,heap     ] GC(18) Allocated:         -                 2M (0%)            2M (0%)           72M (14%)            -                  -          
[1.299s][info   ][gc,heap     ] GC(18)   Garbage:         -               174M (34%)         174M (34%)          88M (17%)            -                  -          
[1.299s][info   ][gc,heap     ] GC(18) Reclaimed:         -                  -                 0M (0%)           86M (17%)            -                  -          
[1.299s][info   ][gc          ] GC(18) Garbage Collection (Allocation Rate) 486M(95%)->402M(79%)
????????????: 11033
[1.335s][info   ][gc,heap,exit] Heap
[1.335s][info   ][gc,heap,exit]  ZHeap           used 402M, capacity 512M, max capacity 512M
[1.336s][info   ][gc,heap,exit]  Metaspace       used 361K, capacity 4508K, committed 4864K, reserved 1056768K
[1.336s][info   ][gc,heap,exit]   class space    used 25K, capacity 392K, committed 512K, reserved 1048576K
```
gc次数降低明显

4. G1
```
[root@0a6ef877d5fa mnt]# java -XX:+UseG1GC -Xms512m -Xmx512m -XX:+PrintGCDetails GCLogAnalysis
[0.006s][warning][gc] -XX:+PrintGCDetails is deprecated. Will use -Xlog:gc* instead.
[0.013s][info   ][gc] Using G1
[0.019s][info   ][gc,init] Version: 15.0.1+9-18 (release)
[0.019s][info   ][gc,init] CPUs: 4 total, 4 available
[0.019s][info   ][gc,init] Memory: 1991M
[0.019s][info   ][gc,init] Large Page Support: Disabled
[0.019s][info   ][gc,init] NUMA Support: Disabled
[0.019s][info   ][gc,init] Compressed Oops: Enabled (32-bit)
[0.019s][info   ][gc,init] Heap Region Size: 1M
[0.019s][info   ][gc,init] Heap Min Capacity: 512M
[0.019s][info   ][gc,init] Heap Initial Capacity: 512M
[0.019s][info   ][gc,init] Heap Max Capacity: 512M
[0.019s][info   ][gc,init] Pre-touch: Disabled
[0.019s][info   ][gc,init] Parallel Workers: 4
[0.019s][info   ][gc,init] Concurrent Workers: 1
[0.019s][info   ][gc,init] Concurrent Refinement Workers: 4
[0.019s][info   ][gc,init] Periodic GC: Disabled
[0.021s][info   ][gc,cds ] Mark closed archive regions in map: [0x00000000fff00000, 0x00000000fff7bff8]
[0.021s][info   ][gc,cds ] Mark open archive regions in map: [0x00000000ffe00000, 0x00000000ffe51ff8]
[0.021s][info   ][gc,metaspace] CDS archive(s) mapped at: [0x0000000800000000-0x0000000800b35000-0x0000000800b35000), size 11751424, SharedBaseAddress: 0x0000000800000000, ArchiveRelocationMode: 0.
[0.021s][info   ][gc,metaspace] Compressed class space mapped at: 0x0000000800b38000-0x0000000840b38000, size: 1073741824
[0.021s][info   ][gc,metaspace] Narrow klass base: 0x0000000800000000, Narrow klass shift: 3, Narrow klass range: 0x100000000
????...
[0.140s][info   ][gc,start    ] GC(0) Pause Young (Normal) (G1 Evacuation Pause)
[0.141s][info   ][gc,task     ] GC(0) Using 4 workers of 4 for evacuation
[0.146s][info   ][gc,phases   ] GC(0)   Pre Evacuate Collection Set: 0.1ms
[0.146s][info   ][gc,phases   ] GC(0)   Merge Heap Roots: 0.5ms
[0.146s][info   ][gc,phases   ] GC(0)   Evacuate Collection Set: 2.6ms
[0.146s][info   ][gc,phases   ] GC(0)   Post Evacuate Collection Set: 1.5ms
[0.146s][info   ][gc,phases   ] GC(0)   Other: 1.3ms
[0.146s][info   ][gc,heap     ] GC(0) Eden regions: 25->0(21)
[0.146s][info   ][gc,heap     ] GC(0) Survivor regions: 0->4(4)
[0.146s][info   ][gc,heap     ] GC(0) Old regions: 0->6
[0.146s][info   ][gc,heap     ] GC(0) Archive regions: 2->2
[0.146s][info   ][gc,heap     ] GC(0) Humongous regions: 10->5
[0.146s][info   ][gc,metaspace] GC(0) Metaspace: 194K(4864K)->194K(4864K) NonClass: 182K(4352K)->182K(4352K) Class: 11K(512K)->11K(512K)
[0.146s][info   ][gc          ] GC(0) Pause Young (Normal) (G1 Evacuation Pause) 35M->15M(512M) 6.326ms
[0.146s][info   ][gc,cpu      ] GC(0) User=0.00s Sys=0.00s Real=0.01s
[0.158s][info   ][gc,start    ] GC(1) Pause Young (Normal) (G1 Evacuation Pause)
[0.158s][info   ][gc,task     ] GC(1) Using 4 workers of 4 for evacuation
[0.163s][info   ][gc,phases   ] GC(1)   Pre Evacuate Collection Set: 0.1ms
[0.163s][info   ][gc,phases   ] GC(1)   Merge Heap Roots: 0.2ms
[0.163s][info   ][gc,phases   ] GC(1)   Evacuate Collection Set: 3.5ms
[0.163s][info   ][gc,phases   ] GC(1)   Post Evacuate Collection Set: 1.0ms
[0.163s][info   ][gc,phases   ] GC(1)   Other: 0.4ms
[0.163s][info   ][gc,heap     ] GC(1) Eden regions: 21->0(21)
[0.163s][info   ][gc,heap     ] GC(1) Survivor regions: 4->4(4)
[0.163s][info   ][gc,heap     ] GC(1) Old regions: 6->12
[0.163s][info   ][gc,heap     ] GC(1) Archive regions: 2->2
[0.163s][info   ][gc,heap     ] GC(1) Humongous regions: 18->10
[0.163s][info   ][gc,metaspace] GC(1) Metaspace: 199K(4864K)->199K(4864K) NonClass: 187K(4352K)->187K(4352K) Class: 11K(512K)->11K(512K)
[0.163s][info   ][gc          ] GC(1) Pause Young (Normal) (G1 Evacuation Pause) 49M->26M(512M) 5.385ms
[0.163s][info   ][gc,cpu      ] GC(1) User=0.00s Sys=0.00s Real=0.00s
[0.171s][info   ][gc,start    ] GC(2) Pause Young (Normal) (G1 Evacuation Pause)
[0.171s][info   ][gc,task     ] GC(2) Using 4 workers of 4 for evacuation
[0.178s][info   ][gc,phases   ] GC(2)   Pre Evacuate Collection Set: 0.2ms
[0.178s][info   ][gc,phases   ] GC(2)   Merge Heap Roots: 0.4ms
[0.178s][info   ][gc,phases   ] GC(2)   Evacuate Collection Set: 4.4ms
[0.178s][info   ][gc,phases   ] GC(2)   Post Evacuate Collection Set: 1.2ms
[0.178s][info   ][gc,phases   ] GC(2)   Other: 0.4ms
[0.178s][info   ][gc,heap     ] GC(2) Eden regions: 21->0(38)
[0.178s][info   ][gc,heap     ] GC(2) Survivor regions: 4->4(4)
[0.178s][info   ][gc,heap     ] GC(2) Old regions: 12->21
[0.178s][info   ][gc,heap     ] GC(2) Archive regions: 2->2
[0.178s][info   ][gc,heap     ] GC(2) Humongous regions: 23->14
[0.178s][info   ][gc,metaspace] GC(2) Metaspace: 208K(4864K)->208K(4864K) NonClass: 197K(4352K)->197K(4352K) Class: 11K(512K)->11K(512K)
[0.178s][info   ][gc          ] GC(2) Pause Young (Normal) (G1 Evacuation Pause) 60M->39M(512M) 6.955ms
[0.178s][info   ][gc,cpu      ] GC(2) User=0.00s Sys=0.01s Real=0.01s
[0.196s][info   ][gc,start    ] GC(3) Pause Young (Normal) (G1 Evacuation Pause)
[0.196s][info   ][gc,task     ] GC(3) Using 4 workers of 4 for evacuation
[0.203s][info   ][gc,phases   ] GC(3)   Pre Evacuate Collection Set: 0.2ms
[0.203s][info   ][gc,phases   ] GC(3)   Merge Heap Roots: 0.3ms
[0.203s][info   ][gc,phases   ] GC(3)   Evacuate Collection Set: 5.2ms
[0.203s][info   ][gc,phases   ] GC(3)   Post Evacuate Collection Set: 1.3ms
[0.204s][info   ][gc,phases   ] GC(3)   Other: 0.4ms
[0.204s][info   ][gc,heap     ] GC(3) Eden regions: 38->0(111)
[0.204s][info   ][gc,heap     ] GC(3) Survivor regions: 4->6(6)
[0.204s][info   ][gc,heap     ] GC(3) Old regions: 21->34
[0.204s][info   ][gc,heap     ] GC(3) Archive regions: 2->2
[0.204s][info   ][gc,heap     ] GC(3) Humongous regions: 32->23
[0.204s][info   ][gc,metaspace] GC(3) Metaspace: 209K(4864K)->209K(4864K) NonClass: 198K(4352K)->198K(4352K) Class: 11K(512K)->11K(512K)
[0.204s][info   ][gc          ] GC(3) Pause Young (Normal) (G1 Evacuation Pause) 95M->62M(512M) 7.708ms
[0.204s][info   ][gc,cpu      ] GC(3) User=0.01s Sys=0.01s Real=0.00s
[0.275s][info   ][gc,start    ] GC(4) Pause Young (Normal) (G1 Evacuation Pause)
[0.275s][info   ][gc,task     ] GC(4) Using 4 workers of 4 for evacuation
[0.285s][info   ][gc,phases   ] GC(4)   Pre Evacuate Collection Set: 0.2ms
[0.285s][info   ][gc,phases   ] GC(4)   Merge Heap Roots: 0.2ms
[0.285s][info   ][gc,phases   ] GC(4)   Evacuate Collection Set: 7.3ms
[0.285s][info   ][gc,phases   ] GC(4)   Post Evacuate Collection Set: 1.3ms
[0.285s][info   ][gc,phases   ] GC(4)   Other: 0.4ms
[0.285s][info   ][gc,heap     ] GC(4) Eden regions: 111->0(55)
[0.285s][info   ][gc,heap     ] GC(4) Survivor regions: 6->15(15)
[0.285s][info   ][gc,heap     ] GC(4) Old regions: 34->66
[0.285s][info   ][gc,heap     ] GC(4) Archive regions: 2->2
[0.285s][info   ][gc,heap     ] GC(4) Humongous regions: 88->46
[0.285s][info   ][gc,metaspace] GC(4) Metaspace: 209K(4864K)->209K(4864K) NonClass: 198K(4352K)->198K(4352K) Class: 11K(512K)->11K(512K)
[0.285s][info   ][gc          ] GC(4) Pause Young (Normal) (G1 Evacuation Pause) 238M->127M(512M) 9.798ms
[0.285s][info   ][gc,cpu      ] GC(4) User=0.01s Sys=0.02s Real=0.01s
[0.304s][info   ][gc,start    ] GC(5) Pause Young (Normal) (G1 Evacuation Pause)
[0.304s][info   ][gc,task     ] GC(5) Using 4 workers of 4 for evacuation
[0.311s][info   ][gc,phases   ] GC(5)   Pre Evacuate Collection Set: 0.4ms
[0.311s][info   ][gc,phases   ] GC(5)   Merge Heap Roots: 0.3ms
[0.311s][info   ][gc,phases   ] GC(5)   Evacuate Collection Set: 5.1ms
[0.311s][info   ][gc,phases   ] GC(5)   Post Evacuate Collection Set: 1.5ms
[0.311s][info   ][gc,phases   ] GC(5)   Other: 0.4ms
[0.311s][info   ][gc,heap     ] GC(5) Eden regions: 55->0(78)
[0.311s][info   ][gc,heap     ] GC(5) Survivor regions: 15->9(9)
[0.311s][info   ][gc,heap     ] GC(5) Old regions: 66->91
[0.311s][info   ][gc,heap     ] GC(5) Archive regions: 2->2
[0.311s][info   ][gc,heap     ] GC(5) Humongous regions: 84->61
[0.311s][info   ][gc,metaspace] GC(5) Metaspace: 209K(4864K)->209K(4864K) NonClass: 198K(4352K)->198K(4352K) Class: 11K(512K)->11K(512K)
[0.312s][info   ][gc          ] GC(5) Pause Young (Normal) (G1 Evacuation Pause) 220M->161M(512M) 7.939ms
[0.312s][info   ][gc,cpu      ] GC(5) User=0.01s Sys=0.01s Real=0.01s
[0.337s][info   ][gc,start    ] GC(6) Pause Young (Normal) (G1 Evacuation Pause)
[0.337s][info   ][gc,task     ] GC(6) Using 4 workers of 4 for evacuation
[0.344s][info   ][gc,phases   ] GC(6)   Pre Evacuate Collection Set: 0.3ms
[0.344s][info   ][gc,phases   ] GC(6)   Merge Heap Roots: 0.5ms
[0.344s][info   ][gc,phases   ] GC(6)   Evacuate Collection Set: 5.3ms
[0.344s][info   ][gc,phases   ] GC(6)   Post Evacuate Collection Set: 1.1ms
[0.344s][info   ][gc,phases   ] GC(6)   Other: 0.6ms
[0.344s][info   ][gc,heap     ] GC(6) Eden regions: 78->0(108)
[0.345s][info   ][gc,heap     ] GC(6) Survivor regions: 9->11(11)
[0.345s][info   ][gc,heap     ] GC(6) Old regions: 91->115
[0.345s][info   ][gc,heap     ] GC(6) Archive regions: 2->2
[0.345s][info   ][gc,heap     ] GC(6) Humongous regions: 109->77
[0.345s][info   ][gc,metaspace] GC(6) Metaspace: 209K(4864K)->209K(4864K) NonClass: 198K(4352K)->198K(4352K) Class: 11K(512K)->11K(512K)
[0.345s][info   ][gc          ] GC(6) Pause Young (Normal) (G1 Evacuation Pause) 287M->203M(512M) 8.043ms
[0.345s][info   ][gc,cpu      ] GC(6) User=0.01s Sys=0.01s Real=0.00s
[0.365s][info   ][gc,start    ] GC(7) Pause Young (Concurrent Start) (G1 Humongous Allocation)
[0.365s][info   ][gc,task     ] GC(7) Using 4 workers of 4 for evacuation
[0.374s][info   ][gc,phases   ] GC(7)   Pre Evacuate Collection Set: 0.6ms
[0.374s][info   ][gc,phases   ] GC(7)   Merge Heap Roots: 0.4ms
[0.374s][info   ][gc,phases   ] GC(7)   Evacuate Collection Set: 6.4ms
[0.374s][info   ][gc,phases   ] GC(7)   Post Evacuate Collection Set: 1.6ms
[0.374s][info   ][gc,phases   ] GC(7)   Other: 0.5ms
[0.374s][info   ][gc,heap     ] GC(7) Eden regions: 63->0(124)
[0.374s][info   ][gc,heap     ] GC(7) Survivor regions: 11->15(15)
[0.374s][info   ][gc,heap     ] GC(7) Old regions: 115->133
[0.374s][info   ][gc,heap     ] GC(7) Archive regions: 2->2
[0.374s][info   ][gc,heap     ] GC(7) Humongous regions: 113->87
[0.374s][info   ][gc,metaspace] GC(7) Metaspace: 209K(4864K)->209K(4864K) NonClass: 198K(4352K)->198K(4352K) Class: 11K(512K)->11K(512K)
[0.374s][info   ][gc          ] GC(7) Pause Young (Concurrent Start) (G1 Humongous Allocation) 301M->235M(512M) 9.705ms
[0.374s][info   ][gc,cpu      ] GC(7) User=0.01s Sys=0.01s Real=0.01s
[0.375s][info   ][gc          ] GC(8) Concurrent Cycle
[0.375s][info   ][gc,marking  ] GC(8) Concurrent Clear Claimed Marks
[0.375s][info   ][gc,marking  ] GC(8) Concurrent Clear Claimed Marks 0.119ms
[0.375s][info   ][gc,marking  ] GC(8) Concurrent Scan Root Regions
[0.378s][info   ][gc,marking  ] GC(8) Concurrent Scan Root Regions 2.214ms
[0.378s][info   ][gc,marking  ] GC(8) Concurrent Mark (0.378s)
[0.378s][info   ][gc,marking  ] GC(8) Concurrent Mark From Roots
[0.378s][info   ][gc,task     ] GC(8) Using 1 workers of 1 for marking
[0.408s][info   ][gc,marking  ] GC(8) Concurrent Mark From Roots 30.497ms
[0.408s][info   ][gc,marking  ] GC(8) Concurrent Preclean
[0.409s][info   ][gc,marking  ] GC(8) Concurrent Preclean 0.498ms
[0.409s][info   ][gc,marking  ] GC(8) Concurrent Mark (0.378s, 0.409s) 31.294ms
[0.410s][info   ][gc,start    ] GC(8) Pause Remark
[0.412s][info   ][gc          ] GC(8) Pause Remark 334M->334M(512M) 2.032ms
[0.412s][info   ][gc,cpu      ] GC(8) User=0.00s Sys=0.00s Real=0.00s
[0.412s][info   ][gc,marking  ] GC(8) Concurrent Rebuild Remembered Sets
[0.432s][info   ][gc,marking  ] GC(8) Concurrent Rebuild Remembered Sets 19.387ms
[0.432s][info   ][gc,start    ] GC(8) Pause Cleanup
[0.433s][info   ][gc          ] GC(8) Pause Cleanup 393M->393M(512M) 0.696ms
[0.433s][info   ][gc,cpu      ] GC(8) User=0.00s Sys=0.00s Real=0.00s
[0.433s][info   ][gc,marking  ] GC(8) Concurrent Cleanup for Next Mark
[0.440s][info   ][gc,marking  ] GC(8) Concurrent Cleanup for Next Mark 6.813ms
[0.440s][info   ][gc          ] GC(8) Concurrent Cycle 65.462ms
[0.453s][info   ][gc,start    ] GC(9) Pause Young (Prepare Mixed) (G1 Evacuation Pause)
[0.453s][info   ][gc,task     ] GC(9) Using 4 workers of 4 for evacuation
[0.468s][info   ][gc          ] GC(9) To-space exhausted
[0.468s][info   ][gc,phases   ] GC(9)   Pre Evacuate Collection Set: 0.7ms
[0.468s][info   ][gc,phases   ] GC(9)   Merge Heap Roots: 0.7ms
[0.468s][info   ][gc,phases   ] GC(9)   Evacuate Collection Set: 10.7ms
[0.468s][info   ][gc,phases   ] GC(9)   Post Evacuate Collection Set: 2.9ms
[0.468s][info   ][gc,phases   ] GC(9)   Other: 0.6ms
[0.468s][info   ][gc,heap     ] GC(9) Eden regions: 124->0(7)
[0.468s][info   ][gc,heap     ] GC(9) Survivor regions: 15->18(18)
[0.468s][info   ][gc,heap     ] GC(9) Old regions: 133->198
[0.468s][info   ][gc,heap     ] GC(9) Archive regions: 2->2
[0.468s][info   ][gc,heap     ] GC(9) Humongous regions: 177->115
[0.468s][info   ][gc,metaspace] GC(9) Metaspace: 209K(4864K)->209K(4864K) NonClass: 198K(4352K)->198K(4352K) Class: 11K(512K)->11K(512K)
[0.469s][info   ][gc          ] GC(9) Pause Young (Prepare Mixed) (G1 Evacuation Pause) 449M->331M(512M) 16.268ms
[0.469s][info   ][gc,cpu      ] GC(9) User=0.01s Sys=0.03s Real=0.02s
[0.472s][info   ][gc,start    ] GC(10) Pause Young (Mixed) (G1 Evacuation Pause)
[0.472s][info   ][gc,task     ] GC(10) Using 4 workers of 4 for evacuation
[0.480s][info   ][gc,phases   ] GC(10)   Pre Evacuate Collection Set: 0.8ms
[0.480s][info   ][gc,phases   ] GC(10)   Merge Heap Roots: 0.5ms
[0.480s][info   ][gc,phases   ] GC(10)   Evacuate Collection Set: 5.5ms
[0.480s][info   ][gc,phases   ] GC(10)   Post Evacuate Collection Set: 1.2ms
[0.481s][info   ][gc,phases   ] GC(10)   Other: 0.4ms
[0.481s][info   ][gc,heap     ] GC(10) Eden regions: 7->0(80)
[0.481s][info   ][gc,heap     ] GC(10) Survivor regions: 18->4(4)
[0.481s][info   ][gc,heap     ] GC(10) Old regions: 198->186
[0.481s][info   ][gc,heap     ] GC(10) Archive regions: 2->2
[0.481s][info   ][gc,heap     ] GC(10) Humongous regions: 119->115
[0.481s][info   ][gc,metaspace] GC(10) Metaspace: 209K(4864K)->209K(4864K) NonClass: 198K(4352K)->198K(4352K) Class: 11K(512K)->11K(512K)
[0.481s][info   ][gc          ] GC(10) Pause Young (Mixed) (G1 Evacuation Pause) 342M->304M(512M) 8.618ms
[0.481s][info   ][gc,cpu      ] GC(10) User=0.01s Sys=0.01s Real=0.01s
[0.482s][info   ][gc,start    ] GC(11) Pause Young (Concurrent Start) (G1 Humongous Allocation)
[0.482s][info   ][gc,task     ] GC(11) Using 4 workers of 4 for evacuation
[0.485s][info   ][gc,phases   ] GC(11)   Pre Evacuate Collection Set: 0.3ms
[0.485s][info   ][gc,phases   ] GC(11)   Merge Heap Roots: 0.4ms
[0.485s][info   ][gc,phases   ] GC(11)   Evacuate Collection Set: 1.4ms
[0.485s][info   ][gc,phases   ] GC(11)   Post Evacuate Collection Set: 0.8ms
[0.485s][info   ][gc,phases   ] GC(11)   Other: 0.4ms
[0.485s][info   ][gc,heap     ] GC(11) Eden regions: 2->0(86)
[0.485s][info   ][gc,heap     ] GC(11) Survivor regions: 4->4(11)
[0.485s][info   ][gc,heap     ] GC(11) Old regions: 186->186
[0.485s][info   ][gc,heap     ] GC(11) Archive regions: 2->2
[0.485s][info   ][gc,heap     ] GC(11) Humongous regions: 115->115
[0.485s][info   ][gc,metaspace] GC(11) Metaspace: 209K(4864K)->209K(4864K) NonClass: 198K(4352K)->198K(4352K) Class: 11K(512K)->11K(512K)
[0.486s][info   ][gc          ] GC(11) Pause Young (Concurrent Start) (G1 Humongous Allocation) 306M->305M(512M) 4.004ms
[0.486s][info   ][gc,cpu      ] GC(11) User=0.00s Sys=0.00s Real=0.01s
[0.486s][info   ][gc          ] GC(12) Concurrent Cycle
[0.486s][info   ][gc,marking  ] GC(12) Concurrent Clear Claimed Marks
[0.486s][info   ][gc,marking  ] GC(12) Concurrent Clear Claimed Marks 0.036ms
[0.486s][info   ][gc,marking  ] GC(12) Concurrent Scan Root Regions
[0.486s][info   ][gc,marking  ] GC(12) Concurrent Scan Root Regions 0.115ms
[0.486s][info   ][gc,marking  ] GC(12) Concurrent Mark (0.486s)
[0.486s][info   ][gc,marking  ] GC(12) Concurrent Mark From Roots
[0.486s][info   ][gc,task     ] GC(12) Using 1 workers of 1 for marking
[0.490s][info   ][gc,marking  ] GC(12) Concurrent Mark From Roots 3.113ms
[0.490s][info   ][gc,marking  ] GC(12) Concurrent Preclean
[0.490s][info   ][gc,marking  ] GC(12) Concurrent Preclean 0.136ms
[0.490s][info   ][gc,marking  ] GC(12) Concurrent Mark (0.486s, 0.490s) 3.365ms
[0.491s][info   ][gc,start    ] GC(12) Pause Remark
[0.493s][info   ][gc          ] GC(12) Pause Remark 305M->305M(512M) 2.287ms
[0.493s][info   ][gc,cpu      ] GC(12) User=0.01s Sys=0.00s Real=0.00s
[0.493s][info   ][gc,marking  ] GC(12) Concurrent Rebuild Remembered Sets
[0.510s][info   ][gc,start    ] GC(13) Pause Young (Normal) (G1 Evacuation Pause)
[0.510s][info   ][gc,task     ] GC(13) Using 4 workers of 4 for evacuation
[0.515s][info   ][gc,phases   ] GC(13)   Pre Evacuate Collection Set: 0.3ms
[0.515s][info   ][gc,phases   ] GC(13)   Merge Heap Roots: 0.3ms
[0.515s][info   ][gc,phases   ] GC(13)   Evacuate Collection Set: 2.8ms
[0.515s][info   ][gc,phases   ] GC(13)   Post Evacuate Collection Set: 1.5ms
[0.516s][info   ][gc,phases   ] GC(13)   Other: 0.5ms
[0.516s][info   ][gc,heap     ] GC(13) Eden regions: 86->0(61)
[0.516s][info   ][gc,heap     ] GC(13) Survivor regions: 4->12(12)
[0.516s][info   ][gc,heap     ] GC(13) Old regions: 186->211
[0.516s][info   ][gc,heap     ] GC(13) Archive regions: 2->2
[0.516s][info   ][gc,heap     ] GC(13) Humongous regions: 156->122
[0.516s][info   ][gc,metaspace] GC(13) Metaspace: 209K(4864K)->209K(4864K) NonClass: 198K(4352K)->198K(4352K) Class: 11K(512K)->11K(512K)
[0.516s][info   ][gc          ] GC(13) Pause Young (Normal) (G1 Evacuation Pause) 432M->345M(512M) 6.239ms
[0.516s][info   ][gc,cpu      ] GC(13) User=0.00s Sys=0.01s Real=0.01s
[0.521s][info   ][gc,marking  ] GC(12) Concurrent Rebuild Remembered Sets 27.890ms
[0.522s][info   ][gc,start    ] GC(12) Pause Cleanup
[0.522s][info   ][gc          ] GC(12) Pause Cleanup 378M->378M(512M) 0.573ms
[0.522s][info   ][gc,cpu      ] GC(12) User=0.00s Sys=0.00s Real=0.00s
[0.523s][info   ][gc,marking  ] GC(12) Concurrent Cleanup for Next Mark
[0.532s][info   ][gc,marking  ] GC(12) Concurrent Cleanup for Next Mark 9.269ms
[0.532s][info   ][gc          ] GC(12) Concurrent Cycle 46.079ms
[0.535s][info   ][gc,start    ] GC(14) Pause Young (Prepare Mixed) (G1 Evacuation Pause)
[0.535s][info   ][gc,task     ] GC(14) Using 4 workers of 4 for evacuation
[0.540s][info   ][gc,phases   ] GC(14)   Pre Evacuate Collection Set: 0.2ms
[0.540s][info   ][gc,phases   ] GC(14)   Merge Heap Roots: 0.3ms
[0.540s][info   ][gc,phases   ] GC(14)   Evacuate Collection Set: 2.9ms
[0.540s][info   ][gc,phases   ] GC(14)   Post Evacuate Collection Set: 1.2ms
[0.540s][info   ][gc,phases   ] GC(14)   Other: 0.5ms
[0.540s][info   ][gc,heap     ] GC(14) Eden regions: 61->0(15)
[0.540s][info   ][gc,heap     ] GC(14) Survivor regions: 12->10(10)
[0.540s][info   ][gc,heap     ] GC(14) Old regions: 211->237
[0.540s][info   ][gc,heap     ] GC(14) Archive regions: 2->2
[0.540s][info   ][gc,heap     ] GC(14) Humongous regions: 156->130
[0.540s][info   ][gc,metaspace] GC(14) Metaspace: 209K(4864K)->209K(4864K) NonClass: 198K(4352K)->198K(4352K) Class: 11K(512K)->11K(512K)
[0.541s][info   ][gc          ] GC(14) Pause Young (Prepare Mixed) (G1 Evacuation Pause) 439M->376M(512M) 5.939ms
[0.541s][info   ][gc,cpu      ] GC(14) User=0.01s Sys=0.01s Real=0.01s
[0.544s][info   ][gc,start    ] GC(15) Pause Young (Mixed) (G1 Evacuation Pause)
[0.544s][info   ][gc,task     ] GC(15) Using 4 workers of 4 for evacuation
[0.550s][info   ][gc,phases   ] GC(15)   Pre Evacuate Collection Set: 0.6ms
[0.550s][info   ][gc,phases   ] GC(15)   Merge Heap Roots: 0.3ms
[0.550s][info   ][gc,phases   ] GC(15)   Evacuate Collection Set: 3.0ms
[0.550s][info   ][gc,phases   ] GC(15)   Post Evacuate Collection Set: 1.4ms
[0.550s][info   ][gc,phases   ] GC(15)   Other: 0.4ms
[0.550s][info   ][gc,heap     ] GC(15) Eden regions: 15->0(59)
[0.550s][info   ][gc,heap     ] GC(15) Survivor regions: 10->4(4)
[0.551s][info   ][gc,heap     ] GC(15) Old regions: 237->210
[0.551s][info   ][gc,heap     ] GC(15) Archive regions: 2->2
[0.551s][info   ][gc,heap     ] GC(15) Humongous regions: 137->131
[0.551s][info   ][gc,metaspace] GC(15) Metaspace: 209K(4864K)->209K(4864K) NonClass: 198K(4352K)->198K(4352K) Class: 11K(512K)->11K(512K)
[0.551s][info   ][gc          ] GC(15) Pause Young (Mixed) (G1 Evacuation Pause) 398M->345M(512M) 7.053ms
[0.551s][info   ][gc,cpu      ] GC(15) User=0.01s Sys=0.01s Real=0.01s
[0.552s][info   ][gc,start    ] GC(16) Pause Young (Concurrent Start) (G1 Humongous Allocation)
[0.552s][info   ][gc,task     ] GC(16) Using 4 workers of 4 for evacuation
[0.556s][info   ][gc,phases   ] GC(16)   Pre Evacuate Collection Set: 0.6ms
[0.556s][info   ][gc,phases   ] GC(16)   Merge Heap Roots: 0.2ms
[0.556s][info   ][gc,phases   ] GC(16)   Evacuate Collection Set: 1.0ms
[0.556s][info   ][gc,phases   ] GC(16)   Post Evacuate Collection Set: 1.2ms
[0.556s][info   ][gc,phases   ] GC(16)   Other: 0.4ms
[0.556s][info   ][gc,heap     ] GC(16) Eden regions: 1->0(54)
[0.556s][info   ][gc,heap     ] GC(16) Survivor regions: 4->5(8)
[0.556s][info   ][gc,heap     ] GC(16) Old regions: 210->210
[0.556s][info   ][gc,heap     ] GC(16) Archive regions: 2->2
[0.557s][info   ][gc,heap     ] GC(16) Humongous regions: 131->131
[0.557s][info   ][gc,metaspace] GC(16) Metaspace: 209K(4864K)->209K(4864K) NonClass: 198K(4352K)->198K(4352K) Class: 11K(512K)->11K(512K)
[0.557s][info   ][gc          ] GC(16) Pause Young (Concurrent Start) (G1 Humongous Allocation) 346M->345M(512M) 4.658ms
[0.557s][info   ][gc,cpu      ] GC(16) User=0.01s Sys=0.00s Real=0.01s
[0.557s][info   ][gc          ] GC(17) Concurrent Cycle
[0.557s][info   ][gc,marking  ] GC(17) Concurrent Clear Claimed Marks
[0.557s][info   ][gc,marking  ] GC(17) Concurrent Clear Claimed Marks 0.057ms
[0.558s][info   ][gc,marking  ] GC(17) Concurrent Scan Root Regions
[0.558s][info   ][gc,marking  ] GC(17) Concurrent Scan Root Regions 0.196ms
[0.558s][info   ][gc,marking  ] GC(17) Concurrent Mark (0.558s)
[0.558s][info   ][gc,marking  ] GC(17) Concurrent Mark From Roots
[0.558s][info   ][gc,task     ] GC(17) Using 1 workers of 1 for marking
[0.561s][info   ][gc,marking  ] GC(17) Concurrent Mark From Roots 3.229ms
[0.561s][info   ][gc,marking  ] GC(17) Concurrent Preclean
[0.562s][info   ][gc,marking  ] GC(17) Concurrent Preclean 0.427ms
[0.562s][info   ][gc,marking  ] GC(17) Concurrent Mark (0.558s, 0.562s) 3.784ms
[0.563s][info   ][gc,start    ] GC(17) Pause Remark
[0.564s][info   ][gc          ] GC(17) Pause Remark 378M->378M(512M) 1.894ms
[0.565s][info   ][gc,cpu      ] GC(17) User=0.00s Sys=0.01s Real=0.00s
[0.565s][info   ][gc,marking  ] GC(17) Concurrent Rebuild Remembered Sets
[0.573s][info   ][gc,start    ] GC(18) Pause Young (Normal) (G1 Evacuation Pause)
[0.573s][info   ][gc,task     ] GC(18) Using 4 workers of 4 for evacuation
[0.577s][info   ][gc,phases   ] GC(18)   Pre Evacuate Collection Set: 0.2ms
[0.577s][info   ][gc,phases   ] GC(18)   Merge Heap Roots: 0.5ms
[0.577s][info   ][gc,phases   ] GC(18)   Evacuate Collection Set: 2.0ms
[0.577s][info   ][gc,phases   ] GC(18)   Post Evacuate Collection Set: 1.5ms
[0.577s][info   ][gc,phases   ] GC(18)   Other: 0.5ms
[0.578s][info   ][gc,heap     ] GC(18) Eden regions: 54->0(39)
[0.578s][info   ][gc,heap     ] GC(18) Survivor regions: 5->8(8)
[0.578s][info   ][gc,heap     ] GC(18) Old regions: 210->229
[0.578s][info   ][gc,heap     ] GC(18) Archive regions: 2->2
[0.578s][info   ][gc,heap     ] GC(18) Humongous regions: 168->139
[0.578s][info   ][gc,metaspace] GC(18) Metaspace: 209K(4864K)->209K(4864K) NonClass: 198K(4352K)->198K(4352K) Class: 11K(512K)->11K(512K)
[0.578s][info   ][gc          ] GC(18) Pause Young (Normal) (G1 Evacuation Pause) 436M->376M(512M) 5.114ms
[0.578s][info   ][gc,cpu      ] GC(18) User=0.00s Sys=0.01s Real=0.01s
[0.587s][info   ][gc,start    ] GC(19) Pause Young (Normal) (G1 Evacuation Pause)
[0.587s][info   ][gc,task     ] GC(19) Using 4 workers of 4 for evacuation
[0.592s][info   ][gc,phases   ] GC(19)   Pre Evacuate Collection Set: 0.7ms
[0.592s][info   ][gc,phases   ] GC(19)   Merge Heap Roots: 0.4ms
[0.592s][info   ][gc,phases   ] GC(19)   Evacuate Collection Set: 2.1ms
[0.592s][info   ][gc,phases   ] GC(19)   Post Evacuate Collection Set: 1.2ms
[0.592s][info   ][gc,phases   ] GC(19)   Other: 0.5ms
[0.592s][info   ][gc,heap     ] GC(19) Eden regions: 39->0(32)
[0.592s][info   ][gc,heap     ] GC(19) Survivor regions: 8->6(6)
[0.592s][info   ][gc,heap     ] GC(19) Old regions: 229->246
[0.592s][info   ][gc,heap     ] GC(19) Archive regions: 2->2
[0.592s][info   ][gc,heap     ] GC(19) Humongous regions: 169->139
[0.592s][info   ][gc,metaspace] GC(19) Metaspace: 209K(4864K)->209K(4864K) NonClass: 198K(4352K)->198K(4352K) Class: 11K(512K)->11K(512K)
[0.592s][info   ][gc          ] GC(19) Pause Young (Normal) (G1 Evacuation Pause) 445M->391M(512M) 5.424ms
[0.592s][info   ][gc,cpu      ] GC(19) User=0.00s Sys=0.00s Real=0.00s
[0.599s][info   ][gc,start    ] GC(20) Pause Young (Normal) (G1 Evacuation Pause)
[0.599s][info   ][gc,task     ] GC(20) Using 4 workers of 4 for evacuation
[0.603s][info   ][gc,phases   ] GC(20)   Pre Evacuate Collection Set: 0.2ms
[0.603s][info   ][gc,phases   ] GC(20)   Merge Heap Roots: 0.3ms
[0.603s][info   ][gc,phases   ] GC(20)   Evacuate Collection Set: 1.7ms
[0.603s][info   ][gc,phases   ] GC(20)   Post Evacuate Collection Set: 1.4ms
[0.603s][info   ][gc,phases   ] GC(20)   Other: 0.5ms
[0.603s][info   ][gc,heap     ] GC(20) Eden regions: 32->0(26)
[0.603s][info   ][gc,heap     ] GC(20) Survivor regions: 6->5(5)
[0.603s][info   ][gc,heap     ] GC(20) Old regions: 246->260
[0.603s][info   ][gc,heap     ] GC(20) Archive regions: 2->2
[0.603s][info   ][gc,heap     ] GC(20) Humongous regions: 160->140
[0.603s][info   ][gc,metaspace] GC(20) Metaspace: 209K(4864K)->209K(4864K) NonClass: 198K(4352K)->198K(4352K) Class: 11K(512K)->11K(512K)
[0.603s][info   ][gc          ] GC(20) Pause Young (Normal) (G1 Evacuation Pause) 444M->405M(512M) 4.576ms
[0.603s][info   ][gc,cpu      ] GC(20) User=0.00s Sys=0.01s Real=0.00s
[0.606s][info   ][gc,marking  ] GC(17) Concurrent Rebuild Remembered Sets 41.048ms
[0.606s][info   ][gc,start    ] GC(17) Pause Cleanup
[0.607s][info   ][gc          ] GC(17) Pause Cleanup 421M->421M(512M) 0.449ms
[0.607s][info   ][gc,cpu      ] GC(17) User=0.00s Sys=0.00s Real=0.00s
[0.607s][info   ][gc,marking  ] GC(17) Concurrent Cleanup for Next Mark
[0.608s][info   ][gc,marking  ] GC(17) Concurrent Cleanup for Next Mark 0.854ms
[0.608s][info   ][gc          ] GC(17) Concurrent Cycle 50.841ms
[0.612s][info   ][gc,start    ] GC(21) Pause Young (Prepare Mixed) (G1 Evacuation Pause)
[0.612s][info   ][gc,task     ] GC(21) Using 4 workers of 4 for evacuation
[0.616s][info   ][gc,phases   ] GC(21)   Pre Evacuate Collection Set: 0.4ms
[0.616s][info   ][gc,phases   ] GC(21)   Merge Heap Roots: 0.4ms
[0.616s][info   ][gc,phases   ] GC(21)   Evacuate Collection Set: 1.7ms
[0.616s][info   ][gc,phases   ] GC(21)   Post Evacuate Collection Set: 1.1ms
[0.616s][info   ][gc,phases   ] GC(21)   Other: 0.5ms
[0.616s][info   ][gc,heap     ] GC(21) Eden regions: 26->0(21)
[0.616s][info   ][gc,heap     ] GC(21) Survivor regions: 5->4(4)
[0.616s][info   ][gc,heap     ] GC(21) Old regions: 260->272
[0.616s][info   ][gc,heap     ] GC(21) Archive regions: 2->2
[0.616s][info   ][gc,heap     ] GC(21) Humongous regions: 152->140
[0.616s][info   ][gc,metaspace] GC(21) Metaspace: 209K(4864K)->209K(4864K) NonClass: 198K(4352K)->198K(4352K) Class: 11K(512K)->11K(512K)
[0.616s][info   ][gc          ] GC(21) Pause Young (Prepare Mixed) (G1 Evacuation Pause) 443M->416M(512M) 4.681ms
[0.616s][info   ][gc,cpu      ] GC(21) User=0.00s Sys=0.01s Real=0.01s
[0.621s][info   ][gc,start    ] GC(22) Pause Young (Mixed) (G1 Evacuation Pause)
[0.621s][info   ][gc,task     ] GC(22) Using 4 workers of 4 for evacuation
[0.626s][info   ][gc,phases   ] GC(22)   Pre Evacuate Collection Set: 0.3ms
[0.626s][info   ][gc,phases   ] GC(22)   Merge Heap Roots: 0.3ms
[0.626s][info   ][gc,phases   ] GC(22)   Evacuate Collection Set: 2.8ms
[0.626s][info   ][gc,phases   ] GC(22)   Post Evacuate Collection Set: 1.6ms
[0.626s][info   ][gc,phases   ] GC(22)   Other: 0.4ms
[0.627s][info   ][gc,heap     ] GC(22) Eden regions: 21->0(21)
[0.627s][info   ][gc,heap     ] GC(22) Survivor regions: 4->4(4)
[0.627s][info   ][gc,heap     ] GC(22) Old regions: 272->248
[0.627s][info   ][gc,heap     ] GC(22) Archive regions: 2->2
[0.627s][info   ][gc,heap     ] GC(22) Humongous regions: 147->137
[0.627s][info   ][gc,metaspace] GC(22) Metaspace: 209K(4864K)->209K(4864K) NonClass: 198K(4352K)->198K(4352K) Class: 11K(512K)->11K(512K)
[0.627s][info   ][gc          ] GC(22) Pause Young (Mixed) (G1 Evacuation Pause) 444M->388M(512M) 5.800ms
[0.627s][info   ][gc,cpu      ] GC(22) User=0.01s Sys=0.01s Real=0.01s
[0.632s][info   ][gc,start    ] GC(23) Pause Young (Mixed) (G1 Evacuation Pause)
[0.632s][info   ][gc,task     ] GC(23) Using 4 workers of 4 for evacuation
[0.638s][info   ][gc,phases   ] GC(23)   Pre Evacuate Collection Set: 0.3ms
[0.638s][info   ][gc,phases   ] GC(23)   Merge Heap Roots: 0.4ms
[0.638s][info   ][gc,phases   ] GC(23)   Evacuate Collection Set: 3.2ms
[0.638s][info   ][gc,phases   ] GC(23)   Post Evacuate Collection Set: 1.0ms
[0.638s][info   ][gc,phases   ] GC(23)   Other: 0.5ms
[0.638s][info   ][gc,heap     ] GC(23) Eden regions: 21->0(39)
[0.638s][info   ][gc,heap     ] GC(23) Survivor regions: 4->4(4)
[0.638s][info   ][gc,heap     ] GC(23) Old regions: 248->234
[0.638s][info   ][gc,heap     ] GC(23) Archive regions: 2->2
[0.638s][info   ][gc,heap     ] GC(23) Humongous regions: 157->137
[0.638s][info   ][gc,metaspace] GC(23) Metaspace: 209K(4864K)->209K(4864K) NonClass: 198K(4352K)->198K(4352K) Class: 11K(512K)->11K(512K)
[0.638s][info   ][gc          ] GC(23) Pause Young (Mixed) (G1 Evacuation Pause) 429M->375M(512M) 5.809ms
[0.638s][info   ][gc,cpu      ] GC(23) User=0.01s Sys=0.00s Real=0.01s
[0.639s][info   ][gc,start    ] GC(24) Pause Young (Concurrent Start) (G1 Humongous Allocation)
[0.639s][info   ][gc,task     ] GC(24) Using 4 workers of 4 for evacuation
[0.643s][info   ][gc,phases   ] GC(24)   Pre Evacuate Collection Set: 0.2ms
[0.643s][info   ][gc,phases   ] GC(24)   Merge Heap Roots: 0.5ms
[0.643s][info   ][gc,phases   ] GC(24)   Evacuate Collection Set: 1.3ms
[0.643s][info   ][gc,phases   ] GC(24)   Post Evacuate Collection Set: 0.8ms
[0.643s][info   ][gc,phases   ] GC(24)   Other: 0.5ms
[0.643s][info   ][gc,heap     ] GC(24) Eden regions: 3->0(42)
[0.643s][info   ][gc,heap     ] GC(24) Survivor regions: 4->1(6)
[0.643s][info   ][gc,heap     ] GC(24) Old regions: 234->239
[0.643s][info   ][gc,heap     ] GC(24) Archive regions: 2->2
[0.643s][info   ][gc,heap     ] GC(24) Humongous regions: 137->137
[0.643s][info   ][gc,metaspace] GC(24) Metaspace: 209K(4864K)->209K(4864K) NonClass: 198K(4352K)->198K(4352K) Class: 11K(512K)->11K(512K)
[0.643s][info   ][gc          ] GC(24) Pause Young (Concurrent Start) (G1 Humongous Allocation) 378M->376M(512M) 3.608ms
[0.643s][info   ][gc,cpu      ] GC(24) User=0.00s Sys=0.01s Real=0.00s
[0.643s][info   ][gc          ] GC(25) Concurrent Cycle
[0.643s][info   ][gc,marking  ] GC(25) Concurrent Clear Claimed Marks
[0.643s][info   ][gc,marking  ] GC(25) Concurrent Clear Claimed Marks 0.143ms
[0.643s][info   ][gc,marking  ] GC(25) Concurrent Scan Root Regions
[0.644s][info   ][gc,marking  ] GC(25) Concurrent Scan Root Regions 0.190ms
[0.644s][info   ][gc,marking  ] GC(25) Concurrent Mark (0.644s)
[0.644s][info   ][gc,marking  ] GC(25) Concurrent Mark From Roots
[0.644s][info   ][gc,task     ] GC(25) Using 1 workers of 1 for marking
[0.648s][info   ][gc,marking  ] GC(25) Concurrent Mark From Roots 3.711ms
[0.648s][info   ][gc,marking  ] GC(25) Concurrent Preclean
[0.648s][info   ][gc,marking  ] GC(25) Concurrent Preclean 0.248ms
[0.648s][info   ][gc,marking  ] GC(25) Concurrent Mark (0.644s, 0.648s) 4.209ms
[0.649s][info   ][gc,start    ] GC(25) Pause Remark
[0.651s][info   ][gc          ] GC(25) Pause Remark 406M->406M(512M) 2.483ms
[0.651s][info   ][gc,cpu      ] GC(25) User=0.00s Sys=0.00s Real=0.00s
[0.652s][info   ][gc,marking  ] GC(25) Concurrent Rebuild Remembered Sets
[0.657s][info   ][gc,start    ] GC(26) Pause Young (Normal) (G1 Evacuation Pause)
[0.657s][info   ][gc,task     ] GC(26) Using 4 workers of 4 for evacuation
[0.661s][info   ][gc,phases   ] GC(26)   Pre Evacuate Collection Set: 0.2ms
[0.661s][info   ][gc,phases   ] GC(26)   Merge Heap Roots: 0.4ms
[0.661s][info   ][gc,phases   ] GC(26)   Evacuate Collection Set: 1.6ms
[0.661s][info   ][gc,phases   ] GC(26)   Post Evacuate Collection Set: 1.1ms
[0.661s][info   ][gc,phases   ] GC(26)   Other: 0.5ms
[0.661s][info   ][gc,heap     ] GC(26) Eden regions: 42->0(36)
[0.661s][info   ][gc,heap     ] GC(26) Survivor regions: 1->6(6)
[0.661s][info   ][gc,heap     ] GC(26) Old regions: 239->250
[0.661s][info   ][gc,heap     ] GC(26) Archive regions: 2->2
[0.661s][info   ][gc,heap     ] GC(26) Humongous regions: 160->131
[0.661s][info   ][gc,metaspace] GC(26) Metaspace: 209K(4864K)->209K(4864K) NonClass: 198K(4352K)->198K(4352K) Class: 11K(512K)->11K(512K)
[0.661s][info   ][gc          ] GC(26) Pause Young (Normal) (G1 Evacuation Pause) 441M->387M(512M) 4.101ms
[0.661s][info   ][gc,cpu      ] GC(26) User=0.01s Sys=0.00s Real=0.00s
[0.669s][info   ][gc,start    ] GC(27) Pause Young (Normal) (G1 Evacuation Pause)
[0.670s][info   ][gc,task     ] GC(27) Using 4 workers of 4 for evacuation
[0.673s][info   ][gc,phases   ] GC(27)   Pre Evacuate Collection Set: 0.2ms
[0.673s][info   ][gc,phases   ] GC(27)   Merge Heap Roots: 0.5ms
[0.673s][info   ][gc,phases   ] GC(27)   Evacuate Collection Set: 1.4ms
[0.673s][info   ][gc,phases   ] GC(27)   Post Evacuate Collection Set: 1.4ms
[0.674s][info   ][gc,phases   ] GC(27)   Other: 0.4ms
[0.674s][info   ][gc,heap     ] GC(27) Eden regions: 36->0(29)
[0.674s][info   ][gc,heap     ] GC(27) Survivor regions: 6->6(6)
[0.674s][info   ][gc,heap     ] GC(27) Old regions: 250->261
[0.674s][info   ][gc,heap     ] GC(27) Archive regions: 2->2
[0.674s][info   ][gc,heap     ] GC(27) Humongous regions: 157->135
[0.674s][info   ][gc,metaspace] GC(27) Metaspace: 209K(4864K)->209K(4864K) NonClass: 198K(4352K)->198K(4352K) Class: 11K(512K)->11K(512K)
[0.674s][info   ][gc          ] GC(27) Pause Young (Normal) (G1 Evacuation Pause) 449M->402M(512M) 4.661ms
[0.674s][info   ][gc,cpu      ] GC(27) User=0.00s Sys=0.01s Real=0.00s
[0.681s][info   ][gc,start    ] GC(28) Pause Young (Normal) (G1 Evacuation Pause)
[0.681s][info   ][gc,task     ] GC(28) Using 4 workers of 4 for evacuation
[0.685s][info   ][gc,phases   ] GC(28)   Pre Evacuate Collection Set: 0.2ms
[0.685s][info   ][gc,phases   ] GC(28)   Merge Heap Roots: 0.4ms
[0.685s][info   ][gc,phases   ] GC(28)   Evacuate Collection Set: 2.0ms
[0.685s][info   ][gc,phases   ] GC(28)   Post Evacuate Collection Set: 1.1ms
[0.685s][info   ][gc,phases   ] GC(28)   Other: 0.5ms
[0.685s][info   ][gc,heap     ] GC(28) Eden regions: 29->0(21)
[0.685s][info   ][gc,heap     ] GC(28) Survivor regions: 6->5(5)
[0.685s][info   ][gc,heap     ] GC(28) Old regions: 261->274
[0.685s][info   ][gc,heap     ] GC(28) Archive regions: 2->2
[0.685s][info   ][gc,heap     ] GC(28) Humongous regions: 155->137
[0.685s][info   ][gc,metaspace] GC(28) Metaspace: 209K(4864K)->209K(4864K) NonClass: 198K(4352K)->198K(4352K) Class: 11K(512K)->11K(512K)
[0.686s][info   ][gc          ] GC(28) Pause Young (Normal) (G1 Evacuation Pause) 451M->416M(512M) 4.987ms
[0.686s][info   ][gc,cpu      ] GC(28) User=0.00s Sys=0.01s Real=0.01s
[0.690s][info   ][gc,start    ] GC(29) Pause Young (Normal) (G1 Evacuation Pause)
[0.690s][info   ][gc,task     ] GC(29) Using 4 workers of 4 for evacuation
[0.694s][info   ][gc,phases   ] GC(29)   Pre Evacuate Collection Set: 0.3ms
[0.694s][info   ][gc,phases   ] GC(29)   Merge Heap Roots: 0.3ms
[0.694s][info   ][gc,phases   ] GC(29)   Evacuate Collection Set: 1.5ms
[0.694s][info   ][gc,phases   ] GC(29)   Post Evacuate Collection Set: 1.0ms
[0.694s][info   ][gc,phases   ] GC(29)   Other: 0.4ms
[0.694s][info   ][gc,heap     ] GC(29) Eden regions: 21->0(21)
[0.695s][info   ][gc,heap     ] GC(29) Survivor regions: 5->4(4)
[0.695s][info   ][gc,heap     ] GC(29) Old regions: 274->283
[0.695s][info   ][gc,heap     ] GC(29) Archive regions: 2->2
[0.695s][info   ][gc,heap     ] GC(29) Humongous regions: 146->138
[0.695s][info   ][gc,metaspace] GC(29) Metaspace: 209K(4864K)->209K(4864K) NonClass: 198K(4352K)->198K(4352K) Class: 11K(512K)->11K(512K)
[0.695s][info   ][gc          ] GC(29) Pause Young (Normal) (G1 Evacuation Pause) 446M->425M(512M) 4.938ms
[0.695s][info   ][gc,cpu      ] GC(29) User=0.01s Sys=0.00s Real=0.00s
[0.700s][info   ][gc,start    ] GC(30) Pause Young (Normal) (G1 Evacuation Pause)
[0.700s][info   ][gc,task     ] GC(30) Using 4 workers of 4 for evacuation
[0.705s][info   ][gc,phases   ] GC(30)   Pre Evacuate Collection Set: 0.4ms
[0.705s][info   ][gc,phases   ] GC(30)   Merge Heap Roots: 0.3ms
[0.705s][info   ][gc,phases   ] GC(30)   Evacuate Collection Set: 2.2ms
[0.705s][info   ][gc,phases   ] GC(30)   Post Evacuate Collection Set: 1.4ms
[0.705s][info   ][gc,phases   ] GC(30)   Other: 0.4ms
[0.705s][info   ][gc,heap     ] GC(30) Eden regions: 21->0(21)
[0.705s][info   ][gc,heap     ] GC(30) Survivor regions: 4->4(4)
[0.705s][info   ][gc,heap     ] GC(30) Old regions: 283->294
[0.705s][info   ][gc,heap     ] GC(30) Archive regions: 2->2
[0.705s][info   ][gc,heap     ] GC(30) Humongous regions: 156->142
[0.705s][info   ][gc,metaspace] GC(30) Metaspace: 209K(4864K)->209K(4864K) NonClass: 198K(4352K)->198K(4352K) Class: 11K(512K)->11K(512K)
[0.706s][info   ][gc          ] GC(30) Pause Young (Normal) (G1 Evacuation Pause) 464M->440M(512M) 5.856ms
[0.706s][info   ][gc,cpu      ] GC(30) User=0.00s Sys=0.01s Real=0.01s
[0.707s][info   ][gc,marking  ] GC(25) Concurrent Rebuild Remembered Sets 55.634ms
[0.708s][info   ][gc,start    ] GC(25) Pause Cleanup
[0.709s][info   ][gc          ] GC(25) Pause Cleanup 448M->448M(512M) 0.601ms
[0.709s][info   ][gc,cpu      ] GC(25) User=0.00s Sys=0.00s Real=0.00s
[0.709s][info   ][gc,marking  ] GC(25) Concurrent Cleanup for Next Mark
[0.710s][info   ][gc,marking  ] GC(25) Concurrent Cleanup for Next Mark 0.768ms
[0.710s][info   ][gc          ] GC(25) Concurrent Cycle 66.892ms
[0.713s][info   ][gc,start    ] GC(31) Pause Young (Prepare Mixed) (G1 Evacuation Pause)
[0.713s][info   ][gc,task     ] GC(31) Using 4 workers of 4 for evacuation
[0.718s][info   ][gc,phases   ] GC(31)   Pre Evacuate Collection Set: 0.6ms
[0.718s][info   ][gc,phases   ] GC(31)   Merge Heap Roots: 0.3ms
[0.718s][info   ][gc,phases   ] GC(31)   Evacuate Collection Set: 1.7ms
[0.718s][info   ][gc,phases   ] GC(31)   Post Evacuate Collection Set: 1.2ms
[0.718s][info   ][gc,phases   ] GC(31)   Other: 0.5ms
[0.718s][info   ][gc,heap     ] GC(31) Eden regions: 21->0(21)
[0.718s][info   ][gc,heap     ] GC(31) Survivor regions: 4->4(4)
[0.718s][info   ][gc,heap     ] GC(31) Old regions: 294->303
[0.719s][info   ][gc,heap     ] GC(31) Archive regions: 2->2
[0.719s][info   ][gc,heap     ] GC(31) Humongous regions: 157->146
[0.719s][info   ][gc,metaspace] GC(31) Metaspace: 209K(4864K)->209K(4864K) NonClass: 198K(4352K)->198K(4352K) Class: 11K(512K)->11K(512K)
[0.719s][info   ][gc          ] GC(31) Pause Young (Prepare Mixed) (G1 Evacuation Pause) 476M->453M(512M) 5.586ms
[0.719s][info   ][gc,cpu      ] GC(31) User=0.00s Sys=0.00s Real=0.01s
[0.725s][info   ][gc,start    ] GC(32) Pause Young (Mixed) (G1 Evacuation Pause)
[0.725s][info   ][gc,task     ] GC(32) Using 4 workers of 4 for evacuation
[0.729s][info   ][gc          ] GC(32) To-space exhausted
[0.729s][info   ][gc,phases   ] GC(32)   Pre Evacuate Collection Set: 0.3ms
[0.729s][info   ][gc,phases   ] GC(32)   Merge Heap Roots: 0.4ms
[0.730s][info   ][gc,phases   ] GC(32)   Evacuate Collection Set: 2.2ms
[0.730s][info   ][gc,phases   ] GC(32)   Post Evacuate Collection Set: 1.5ms
[0.730s][info   ][gc,phases   ] GC(32)   Other: 0.6ms
[0.730s][info   ][gc,heap     ] GC(32) Eden regions: 21->0(21)
[0.730s][info   ][gc,heap     ] GC(32) Survivor regions: 4->4(4)
[0.730s][info   ][gc,heap     ] GC(32) Old regions: 303->301
[0.730s][info   ][gc,heap     ] GC(32) Archive regions: 2->2
[0.730s][info   ][gc,heap     ] GC(32) Humongous regions: 159->149
[0.731s][info   ][gc,metaspace] GC(32) Metaspace: 209K(4864K)->209K(4864K) NonClass: 198K(4352K)->198K(4352K) Class: 11K(512K)->11K(512K)
[0.731s][info   ][gc          ] GC(32) Pause Young (Mixed) (G1 Evacuation Pause) 487M->454M(512M) 6.447ms
[0.731s][info   ][gc,cpu      ] GC(32) User=0.01s Sys=0.00s Real=0.01s
[0.736s][info   ][gc,start    ] GC(33) Pause Young (Mixed) (G1 Evacuation Pause)
[0.736s][info   ][gc,task     ] GC(33) Using 4 workers of 4 for evacuation
[0.742s][info   ][gc          ] GC(33) To-space exhausted
[0.742s][info   ][gc,phases   ] GC(33)   Pre Evacuate Collection Set: 0.4ms
[0.742s][info   ][gc,phases   ] GC(33)   Merge Heap Roots: 0.4ms
[0.742s][info   ][gc,phases   ] GC(33)   Evacuate Collection Set: 2.8ms
[0.743s][info   ][gc,phases   ] GC(33)   Post Evacuate Collection Set: 1.8ms
[0.743s][info   ][gc,phases   ] GC(33)   Other: 0.7ms
[0.743s][info   ][gc,heap     ] GC(33) Eden regions: 21->0(22)
[0.743s][info   ][gc,heap     ] GC(33) Survivor regions: 4->3(4)
[0.743s][info   ][gc,heap     ] GC(33) Old regions: 301->319
[0.743s][info   ][gc,heap     ] GC(33) Archive regions: 2->2
[0.744s][info   ][gc,heap     ] GC(33) Humongous regions: 164->156
[0.744s][info   ][gc,metaspace] GC(33) Metaspace: 209K(4864K)->209K(4864K) NonClass: 198K(4352K)->198K(4352K) Class: 11K(512K)->11K(512K)
[0.744s][info   ][gc          ] GC(33) Pause Young (Mixed) (G1 Evacuation Pause) 490M->478M(512M) 7.858ms
[0.744s][info   ][gc,cpu      ] GC(33) User=0.00s Sys=0.00s Real=0.00s
[0.745s][info   ][gc,start    ] GC(34) Pause Young (Concurrent Start) (G1 Humongous Allocation)
[0.745s][info   ][gc,task     ] GC(34) Using 4 workers of 4 for evacuation
[0.749s][info   ][gc,phases   ] GC(34)   Pre Evacuate Collection Set: 0.4ms
[0.749s][info   ][gc,phases   ] GC(34)   Merge Heap Roots: 0.2ms
[0.749s][info   ][gc,phases   ] GC(34)   Evacuate Collection Set: 1.1ms
[0.749s][info   ][gc,phases   ] GC(34)   Post Evacuate Collection Set: 1.2ms
[0.749s][info   ][gc,phases   ] GC(34)   Other: 0.5ms
[0.749s][info   ][gc,heap     ] GC(34) Eden regions: 2->0(24)
[0.749s][info   ][gc,heap     ] GC(34) Survivor regions: 3->1(4)
[0.750s][info   ][gc,heap     ] GC(34) Old regions: 319->323
[0.750s][info   ][gc,heap     ] GC(34) Archive regions: 2->2
[0.750s][info   ][gc,heap     ] GC(34) Humongous regions: 156->156
[0.750s][info   ][gc,metaspace] GC(34) Metaspace: 209K(4864K)->209K(4864K) NonClass: 198K(4352K)->198K(4352K) Class: 11K(512K)->11K(512K)
[0.750s][info   ][gc          ] GC(34) Pause Young (Concurrent Start) (G1 Humongous Allocation) 479M->479M(512M) 4.941ms
[0.750s][info   ][gc,cpu      ] GC(34) User=0.01s Sys=0.00s Real=0.01s
[0.751s][info   ][gc          ] GC(35) Concurrent Cycle
[0.751s][info   ][gc,marking  ] GC(35) Concurrent Clear Claimed Marks
[0.751s][info   ][gc,marking  ] GC(35) Concurrent Clear Claimed Marks 0.038ms
[0.751s][info   ][gc,marking  ] GC(35) Concurrent Scan Root Regions
[0.751s][info   ][gc,marking  ] GC(35) Concurrent Scan Root Regions 0.090ms
[0.751s][info   ][gc,marking  ] GC(35) Concurrent Mark (0.751s)
[0.751s][info   ][gc,marking  ] GC(35) Concurrent Mark From Roots
[0.751s][info   ][gc,task     ] GC(35) Using 1 workers of 1 for marking
[0.755s][info   ][gc,start    ] GC(36) Pause Young (Normal) (G1 Evacuation Pause)
[0.755s][info   ][gc,task     ] GC(36) Using 4 workers of 4 for evacuation
[0.759s][info   ][gc          ] GC(36) To-space exhausted
[0.759s][info   ][gc,phases   ] GC(36)   Pre Evacuate Collection Set: 0.3ms
[0.759s][info   ][gc,phases   ] GC(36)   Merge Heap Roots: 0.3ms
[0.759s][info   ][gc,phases   ] GC(36)   Evacuate Collection Set: 1.3ms
[0.759s][info   ][gc,phases   ] GC(36)   Post Evacuate Collection Set: 1.4ms
[0.759s][info   ][gc,phases   ] GC(36)   Other: 0.5ms
[0.759s][info   ][gc,heap     ] GC(36) Eden regions: 18->0(25)
[0.759s][info   ][gc,heap     ] GC(36) Survivor regions: 1->0(0)
[0.759s][info   ][gc,heap     ] GC(36) Old regions: 323->341
[0.760s][info   ][gc,heap     ] GC(36) Archive regions: 2->2
[0.760s][info   ][gc,heap     ] GC(36) Humongous regions: 168->156
[0.760s][info   ][gc,metaspace] GC(36) Metaspace: 209K(4864K)->209K(4864K) NonClass: 198K(4352K)->198K(4352K) Class: 11K(512K)->11K(512K)
[0.760s][info   ][gc          ] GC(36) Pause Young (Normal) (G1 Evacuation Pause) 509M->497M(512M) 5.004ms
[0.760s][info   ][gc,cpu      ] GC(36) User=0.00s Sys=0.00s Real=0.01s
[0.761s][info   ][gc,marking  ] GC(35) Concurrent Mark From Roots 9.768ms
[0.761s][info   ][gc,marking  ] GC(35) Concurrent Preclean
[0.761s][info   ][gc,marking  ] GC(35) Concurrent Preclean 0.141ms
[0.761s][info   ][gc,marking  ] GC(35) Concurrent Mark (0.751s, 0.761s) 10.209ms
[0.763s][info   ][gc,start    ] GC(35) Pause Remark
[0.765s][info   ][gc          ] GC(35) Pause Remark 498M->496M(512M) 1.969ms
[0.765s][info   ][gc,cpu      ] GC(35) User=0.00s Sys=0.00s Real=0.00s
[0.765s][info   ][gc,marking  ] GC(35) Concurrent Rebuild Remembered Sets
[0.768s][info   ][gc,start    ] GC(37) Pause Young (Normal) (G1 Evacuation Pause)
[0.769s][info   ][gc,task     ] GC(37) Using 4 workers of 4 for evacuation
[0.773s][info   ][gc          ] GC(37) To-space exhausted
[0.773s][info   ][gc,phases   ] GC(37)   Pre Evacuate Collection Set: 0.7ms
[0.773s][info   ][gc,phases   ] GC(37)   Merge Heap Roots: 0.3ms
[0.773s][info   ][gc,phases   ] GC(37)   Evacuate Collection Set: 1.3ms
[0.773s][info   ][gc,phases   ] GC(37)   Post Evacuate Collection Set: 1.5ms
[0.773s][info   ][gc,phases   ] GC(37)   Other: 0.5ms
[0.773s][info   ][gc,heap     ] GC(37) Eden regions: 8->0(25)
[0.773s][info   ][gc,heap     ] GC(37) Survivor regions: 0->0(0)
[0.773s][info   ][gc,heap     ] GC(37) Old regions: 339->347
[0.773s][info   ][gc,heap     ] GC(37) Archive regions: 2->2
[0.773s][info   ][gc,heap     ] GC(37) Humongous regions: 163->158
[0.774s][info   ][gc,metaspace] GC(37) Metaspace: 209K(4864K)->209K(4864K) NonClass: 198K(4352K)->198K(4352K) Class: 11K(512K)->11K(512K)
[0.774s][info   ][gc          ] GC(37) Pause Young (Normal) (G1 Evacuation Pause) 510M->505M(512M) 5.432ms
[0.774s][info   ][gc,cpu      ] GC(37) User=0.00s Sys=0.00s Real=0.00s
[0.776s][info   ][gc,start    ] GC(38) Pause Young (Normal) (G1 Humongous Allocation)
[0.776s][info   ][gc,task     ] GC(38) Using 4 workers of 4 for evacuation
[0.779s][info   ][gc          ] GC(38) To-space exhausted
[0.779s][info   ][gc,phases   ] GC(38)   Pre Evacuate Collection Set: 0.3ms
[0.779s][info   ][gc,phases   ] GC(38)   Merge Heap Roots: 0.2ms
[0.779s][info   ][gc,phases   ] GC(38)   Evacuate Collection Set: 1.3ms
[0.779s][info   ][gc,phases   ] GC(38)   Post Evacuate Collection Set: 1.4ms
[0.780s][info   ][gc,phases   ] GC(38)   Other: 0.5ms
[0.780s][info   ][gc,heap     ] GC(38) Eden regions: 4->0(25)
[0.780s][info   ][gc,heap     ] GC(38) Survivor regions: 0->0(0)
[0.780s][info   ][gc,heap     ] GC(38) Old regions: 347->350
[0.780s][info   ][gc,heap     ] GC(38) Archive regions: 2->2
[0.780s][info   ][gc,heap     ] GC(38) Humongous regions: 159->159
[0.780s][info   ][gc,metaspace] GC(38) Metaspace: 209K(4864K)->209K(4864K) NonClass: 198K(4352K)->198K(4352K) Class: 11K(512K)->11K(512K)
[0.780s][info   ][gc          ] GC(38) Pause Young (Normal) (G1 Humongous Allocation) 510M->509M(512M) 4.215ms
[0.780s][info   ][gc,cpu      ] GC(38) User=0.00s Sys=0.01s Real=0.00s
[0.782s][info   ][gc,start    ] GC(39) Pause Young (Normal) (G1 Evacuation Pause)
[0.782s][info   ][gc,task     ] GC(39) Using 4 workers of 4 for evacuation
[0.785s][info   ][gc,phases   ] GC(39)   Pre Evacuate Collection Set: 0.3ms
[0.785s][info   ][gc,phases   ] GC(39)   Merge Heap Roots: 0.3ms
[0.785s][info   ][gc,phases   ] GC(39)   Evacuate Collection Set: 1.3ms
[0.785s][info   ][gc,phases   ] GC(39)   Post Evacuate Collection Set: 1.0ms
[0.785s][info   ][gc,phases   ] GC(39)   Other: 0.4ms
[0.785s][info   ][gc,heap     ] GC(39) Eden regions: 0->0(25)
[0.785s][info   ][gc,heap     ] GC(39) Survivor regions: 0->0(0)
[0.785s][info   ][gc,heap     ] GC(39) Old regions: 350->350
[0.785s][info   ][gc,heap     ] GC(39) Archive regions: 2->2
[0.785s][info   ][gc,heap     ] GC(39) Humongous regions: 160->160
[0.785s][info   ][gc,metaspace] GC(39) Metaspace: 209K(4864K)->209K(4864K) NonClass: 198K(4352K)->198K(4352K) Class: 11K(512K)->11K(512K)
[0.785s][info   ][gc          ] GC(39) Pause Young (Normal) (G1 Evacuation Pause) 510M->510M(512M) 3.756ms
[0.785s][info   ][gc,cpu      ] GC(39) User=0.00s Sys=0.00s Real=0.00s
[0.785s][info   ][gc,ergo     ] Attempting maximally compacting collection
[0.786s][info   ][gc,task     ] GC(40) Using 4 workers of 4 for full compaction
[0.786s][info   ][gc,start    ] GC(40) Pause Full (G1 Evacuation Pause)
[0.787s][info   ][gc,phases,start] GC(40) Phase 1: Mark live objects
[0.789s][info   ][gc,phases      ] GC(40) Phase 1: Mark live objects 2.157ms
[0.789s][info   ][gc,phases,start] GC(40) Phase 2: Prepare for compaction
[0.790s][info   ][gc,phases      ] GC(40) Phase 2: Prepare for compaction 0.904ms
[0.790s][info   ][gc,phases,start] GC(40) Phase 3: Adjust pointers
[0.791s][info   ][gc,phases      ] GC(40) Phase 3: Adjust pointers 1.163ms
[0.791s][info   ][gc,phases,start] GC(40) Phase 4: Compact heap
[0.803s][info   ][gc,phases      ] GC(40) Phase 4: Compact heap 11.761ms
[0.803s][info   ][gc,heap        ] GC(40) Eden regions: 0->0(49)
[0.804s][info   ][gc,heap        ] GC(40) Survivor regions: 0->0(0)
[0.804s][info   ][gc,heap        ] GC(40) Old regions: 350->214
[0.804s][info   ][gc,heap        ] GC(40) Archive regions: 2->2
[0.804s][info   ][gc,heap        ] GC(40) Humongous regions: 160->160
[0.804s][info   ][gc,metaspace   ] GC(40) Metaspace: 209K(4864K)->209K(4864K) NonClass: 198K(4352K)->198K(4352K) Class: 11K(512K)->11K(512K)
[0.804s][info   ][gc             ] GC(40) Pause Full (G1 Evacuation Pause) 510M->347M(512M) 18.562ms
[0.804s][info   ][gc,cpu         ] GC(40) User=0.04s Sys=0.01s Real=0.02s
[0.805s][info   ][gc,marking     ] GC(35) Concurrent Rebuild Remembered Sets 40.085ms
[0.805s][info   ][gc,marking     ] GC(35) Concurrent Mark Abort
[0.805s][info   ][gc             ] GC(35) Concurrent Cycle 54.721ms
[0.806s][info   ][gc,start       ] GC(41) Pause Young (Concurrent Start) (G1 Humongous Allocation)
[0.806s][info   ][gc,task        ] GC(41) Using 4 workers of 4 for evacuation
[0.810s][info   ][gc,phases      ] GC(41)   Pre Evacuate Collection Set: 0.4ms
[0.810s][info   ][gc,phases      ] GC(41)   Merge Heap Roots: 0.4ms
[0.810s][info   ][gc,phases      ] GC(41)   Evacuate Collection Set: 0.9ms
[0.810s][info   ][gc,phases      ] GC(41)   Post Evacuate Collection Set: 1.4ms
[0.810s][info   ][gc,phases      ] GC(41)   Other: 0.5ms
[0.810s][info   ][gc,heap        ] GC(41) Eden regions: 2->0(51)
[0.810s][info   ][gc,heap        ] GC(41) Survivor regions: 0->1(7)
[0.810s][info   ][gc,heap        ] GC(41) Old regions: 214->214
[0.810s][info   ][gc,heap        ] GC(41) Archive regions: 2->2
[0.810s][info   ][gc,heap        ] GC(41) Humongous regions: 160->160
[0.810s][info   ][gc,metaspace   ] GC(41) Metaspace: 209K(4864K)->209K(4864K) NonClass: 198K(4352K)->198K(4352K) Class: 11K(512K)->11K(512K)
[0.810s][info   ][gc             ] GC(41) Pause Young (Concurrent Start) (G1 Humongous Allocation) 348M->347M(512M) 4.101ms
[0.811s][info   ][gc,cpu         ] GC(41) User=0.00s Sys=0.00s Real=0.00s
[0.811s][info   ][gc             ] GC(42) Concurrent Cycle
[0.811s][info   ][gc,marking     ] GC(42) Concurrent Clear Claimed Marks
[0.811s][info   ][gc,marking     ] GC(42) Concurrent Clear Claimed Marks 0.056ms
[0.811s][info   ][gc,marking     ] GC(42) Concurrent Scan Root Regions
[0.811s][info   ][gc,marking     ] GC(42) Concurrent Scan Root Regions 0.162ms
[0.811s][info   ][gc,marking     ] GC(42) Concurrent Mark (0.811s)
[0.811s][info   ][gc,marking     ] GC(42) Concurrent Mark From Roots
[0.811s][info   ][gc,task        ] GC(42) Using 1 workers of 1 for marking
[0.815s][info   ][gc,marking     ] GC(42) Concurrent Mark From Roots 3.387ms
[0.815s][info   ][gc,marking     ] GC(42) Concurrent Preclean
[0.815s][info   ][gc,marking     ] GC(42) Concurrent Preclean 0.123ms
[0.815s][info   ][gc,marking     ] GC(42) Concurrent Mark (0.811s, 0.815s) 3.618ms
[0.815s][info   ][gc,start       ] GC(42) Pause Remark
[0.819s][info   ][gc             ] GC(42) Pause Remark 370M->370M(512M) 3.264ms
[0.819s][info   ][gc,cpu         ] GC(42) User=0.00s Sys=0.00s Real=0.01s
[0.819s][info   ][gc,marking     ] GC(42) Concurrent Rebuild Remembered Sets
[0.826s][info   ][gc,start       ] GC(43) Pause Young (Normal) (G1 Evacuation Pause)
[0.826s][info   ][gc,task        ] GC(43) Using 4 workers of 4 for evacuation
[0.830s][info   ][gc,phases      ] GC(43)   Pre Evacuate Collection Set: 0.2ms
[0.830s][info   ][gc,phases      ] GC(43)   Merge Heap Roots: 0.6ms
[0.830s][info   ][gc,phases      ] GC(43)   Evacuate Collection Set: 1.9ms
[0.830s][info   ][gc,phases      ] GC(43)   Post Evacuate Collection Set: 1.1ms
[0.831s][info   ][gc,phases      ] GC(43)   Other: 0.5ms
[0.831s][info   ][gc,heap        ] GC(43) Eden regions: 51->0(28)
[0.831s][info   ][gc,heap        ] GC(43) Survivor regions: 1->7(7)
[0.831s][info   ][gc,heap        ] GC(43) Old regions: 214->232
[0.831s][info   ][gc,heap        ] GC(43) Archive regions: 2->2
[0.831s][info   ][gc,heap        ] GC(43) Humongous regions: 182->169
[0.831s][info   ][gc,metaspace   ] GC(43) Metaspace: 209K(4864K)->209K(4864K) NonClass: 198K(4352K)->198K(4352K) Class: 11K(512K)->11K(512K)
[0.831s][info   ][gc             ] GC(43) Pause Young (Normal) (G1 Evacuation Pause) 420M->381M(512M) 4.950ms
[0.831s][info   ][gc,cpu         ] GC(43) User=0.00s Sys=0.01s Real=0.00s
[0.837s][info   ][gc,start       ] GC(44) Pause Young (Normal) (G1 Evacuation Pause)
[0.837s][info   ][gc,task        ] GC(44) Using 4 workers of 4 for evacuation
[0.842s][info   ][gc,phases      ] GC(44)   Pre Evacuate Collection Set: 0.2ms
[0.842s][info   ][gc,phases      ] GC(44)   Merge Heap Roots: 0.5ms
[0.842s][info   ][gc,phases      ] GC(44)   Evacuate Collection Set: 2.1ms
[0.842s][info   ][gc,phases      ] GC(44)   Post Evacuate Collection Set: 0.9ms
[0.842s][info   ][gc,phases      ] GC(44)   Other: 0.4ms
[0.842s][info   ][gc,heap        ] GC(44) Eden regions: 28->0(20)
[0.842s][info   ][gc,heap        ] GC(44) Survivor regions: 7->5(5)
[0.842s][info   ][gc,heap        ] GC(44) Old regions: 232->247
[0.842s][info   ][gc,heap        ] GC(44) Archive regions: 2->2
[0.842s][info   ][gc,heap        ] GC(44) Humongous regions: 186->177
[0.842s][info   ][gc,metaspace   ] GC(44) Metaspace: 209K(4864K)->209K(4864K) NonClass: 198K(4352K)->198K(4352K) Class: 11K(512K)->11K(512K)
[0.842s][info   ][gc             ] GC(44) Pause Young (Normal) (G1 Evacuation Pause) 426M->402M(512M) 4.634ms
[0.842s][info   ][gc,cpu         ] GC(44) User=0.00s Sys=0.01s Real=0.00s
[0.846s][info   ][gc,start       ] GC(45) Pause Young (Normal) (G1 Evacuation Pause)
[0.846s][info   ][gc,task        ] GC(45) Using 4 workers of 4 for evacuation
[0.850s][info   ][gc,phases      ] GC(45)   Pre Evacuate Collection Set: 0.5ms
[0.850s][info   ][gc,phases      ] GC(45)   Merge Heap Roots: 0.2ms
[0.850s][info   ][gc,phases      ] GC(45)   Evacuate Collection Set: 1.4ms
[0.850s][info   ][gc,phases      ] GC(45)   Post Evacuate Collection Set: 0.9ms
[0.850s][info   ][gc,phases      ] GC(45)   Other: 0.4ms
[0.850s][info   ][gc,heap        ] GC(45) Eden regions: 20->0(21)
[0.850s][info   ][gc,heap        ] GC(45) Survivor regions: 5->4(4)
[0.850s][info   ][gc,heap        ] GC(45) Old regions: 247->256
[0.850s][info   ][gc,heap        ] GC(45) Archive regions: 2->2
[0.850s][info   ][gc,heap        ] GC(45) Humongous regions: 192->181
[0.850s][info   ][gc,metaspace   ] GC(45) Metaspace: 209K(4864K)->209K(4864K) NonClass: 198K(4352K)->198K(4352K) Class: 11K(512K)->11K(512K)
[0.851s][info   ][gc             ] GC(45) Pause Young (Normal) (G1 Evacuation Pause) 437M->413M(512M) 4.433ms
[0.851s][info   ][gc,cpu         ] GC(45) User=0.01s Sys=0.00s Real=0.00s
[0.856s][info   ][gc,start       ] GC(46) Pause Young (Normal) (G1 Evacuation Pause)
[0.856s][info   ][gc,task        ] GC(46) Using 4 workers of 4 for evacuation
[0.860s][info   ][gc,phases      ] GC(46)   Pre Evacuate Collection Set: 0.3ms
[0.860s][info   ][gc,phases      ] GC(46)   Merge Heap Roots: 0.3ms
[0.860s][info   ][gc,phases      ] GC(46)   Evacuate Collection Set: 1.8ms
[0.860s][info   ][gc,phases      ] GC(46)   Post Evacuate Collection Set: 1.5ms
[0.860s][info   ][gc,phases      ] GC(46)   Other: 0.5ms
[0.861s][info   ][gc,heap        ] GC(46) Eden regions: 21->0(21)
[0.861s][info   ][gc,heap        ] GC(46) Survivor regions: 4->4(4)
[0.861s][info   ][gc,heap        ] GC(46) Old regions: 256->265
[0.861s][info   ][gc,heap        ] GC(46) Archive regions: 2->2
[0.861s][info   ][gc,heap        ] GC(46) Humongous regions: 193->187
[0.861s][info   ][gc,metaspace   ] GC(46) Metaspace: 209K(4864K)->209K(4864K) NonClass: 198K(4352K)->198K(4352K) Class: 11K(512K)->11K(512K)
[0.861s][info   ][gc             ] GC(46) Pause Young (Normal) (G1 Evacuation Pause) 446M->428M(512M) 4.961ms
[0.861s][info   ][gc,cpu         ] GC(46) User=0.00s Sys=0.00s Real=0.00s
[0.865s][info   ][gc,start       ] GC(47) Pause Young (Normal) (G1 Evacuation Pause)
[0.865s][info   ][gc,task        ] GC(47) Using 4 workers of 4 for evacuation
[0.869s][info   ][gc,phases      ] GC(47)   Pre Evacuate Collection Set: 0.6ms
[0.869s][info   ][gc,phases      ] GC(47)   Merge Heap Roots: 0.2ms
[0.869s][info   ][gc,phases      ] GC(47)   Evacuate Collection Set: 1.4ms
[0.869s][info   ][gc,phases      ] GC(47)   Post Evacuate Collection Set: 0.9ms
[0.869s][info   ][gc,phases      ] GC(47)   Other: 0.4ms
[0.869s][info   ][gc,heap        ] GC(47) Eden regions: 21->0(21)
[0.870s][info   ][gc,heap        ] GC(47) Survivor regions: 4->4(4)
[0.870s][info   ][gc,heap        ] GC(47) Old regions: 265->274
[0.870s][info   ][gc,heap        ] GC(47) Archive regions: 2->2
[0.870s][info   ][gc,heap        ] GC(47) Humongous regions: 199->196
[0.870s][info   ][gc,metaspace   ] GC(47) Metaspace: 209K(4864K)->209K(4864K) NonClass: 198K(4352K)->198K(4352K) Class: 11K(512K)->11K(512K)
[0.871s][info   ][gc             ] GC(47) Pause Young (Normal) (G1 Evacuation Pause) 461M->447M(512M) 5.428ms
[0.871s][info   ][gc,cpu         ] GC(47) User=0.00s Sys=0.00s Real=0.01s
[0.873s][info   ][gc,marking     ] GC(42) Concurrent Rebuild Remembered Sets 53.734ms
[0.873s][info   ][gc,start       ] GC(42) Pause Cleanup
[0.874s][info   ][gc             ] GC(42) Pause Cleanup 461M->461M(512M) 0.693ms
[0.874s][info   ][gc,cpu         ] GC(42) User=0.00s Sys=0.00s Real=0.00s
[0.874s][info   ][gc,marking     ] GC(42) Concurrent Cleanup for Next Mark
[0.875s][info   ][gc,marking     ] GC(42) Concurrent Cleanup for Next Mark 0.734ms
[0.875s][info   ][gc             ] GC(42) Concurrent Cycle 64.106ms
[0.876s][info   ][gc,start       ] GC(48) Pause Young (Concurrent Start) (G1 Humongous Allocation)
[0.876s][info   ][gc,task        ] GC(48) Using 4 workers of 4 for evacuation
[0.880s][info   ][gc,phases      ] GC(48)   Pre Evacuate Collection Set: 0.3ms
[0.880s][info   ][gc,phases      ] GC(48)   Merge Heap Roots: 0.5ms
[0.880s][info   ][gc,phases      ] GC(48)   Evacuate Collection Set: 1.5ms
[0.880s][info   ][gc,phases      ] GC(48)   Post Evacuate Collection Set: 1.2ms
[0.880s][info   ][gc,phases      ] GC(48)   Other: 0.7ms
[0.880s][info   ][gc,heap        ] GC(48) Eden regions: 13->0(21)
[0.880s][info   ][gc,heap        ] GC(48) Survivor regions: 4->4(4)
[0.880s][info   ][gc,heap        ] GC(48) Old regions: 274->280
[0.880s][info   ][gc,heap        ] GC(48) Archive regions: 2->2
[0.881s][info   ][gc,heap        ] GC(48) Humongous regions: 200->166
[0.881s][info   ][gc,metaspace   ] GC(48) Metaspace: 209K(4864K)->209K(4864K) NonClass: 198K(4352K)->198K(4352K) Class: 11K(512K)->11K(512K)
[0.881s][info   ][gc             ] GC(48) Pause Young (Concurrent Start) (G1 Humongous Allocation) 463M->423M(512M) 5.582ms
[0.881s][info   ][gc,cpu         ] GC(48) User=0.01s Sys=0.00s Real=0.01s
[0.882s][info   ][gc             ] GC(49) Concurrent Cycle
[0.882s][info   ][gc,marking     ] GC(49) Concurrent Clear Claimed Marks
[0.882s][info   ][gc,marking     ] GC(49) Concurrent Clear Claimed Marks 0.124ms
[0.882s][info   ][gc,marking     ] GC(49) Concurrent Scan Root Regions
[0.882s][info   ][gc,marking     ] GC(49) Concurrent Scan Root Regions 0.128ms
[0.882s][info   ][gc,marking     ] GC(49) Concurrent Mark (0.882s)
[0.882s][info   ][gc,marking     ] GC(49) Concurrent Mark From Roots
[0.882s][info   ][gc,task        ] GC(49) Using 1 workers of 1 for marking
[0.887s][info   ][gc,marking     ] GC(49) Concurrent Mark From Roots 4.458ms
[0.887s][info   ][gc,marking     ] GC(49) Concurrent Preclean
[0.887s][info   ][gc,marking     ] GC(49) Concurrent Preclean 0.289ms
[0.887s][info   ][gc,marking     ] GC(49) Concurrent Mark (0.882s, 0.887s) 4.899ms
[0.888s][info   ][gc,start       ] GC(49) Pause Remark
[0.890s][info   ][gc             ] GC(49) Pause Remark 456M->456M(512M) 1.559ms
[0.890s][info   ][gc,cpu         ] GC(49) User=0.00s Sys=0.00s Real=0.00s
[0.890s][info   ][gc,marking     ] GC(49) Concurrent Rebuild Remembered Sets
[0.891s][info   ][gc,start       ] GC(50) Pause Young (Normal) (G1 Evacuation Pause)
[0.891s][info   ][gc,task        ] GC(50) Using 4 workers of 4 for evacuation
[0.895s][info   ][gc,phases      ] GC(50)   Pre Evacuate Collection Set: 0.3ms
[0.895s][info   ][gc,phases      ] GC(50)   Merge Heap Roots: 0.4ms
[0.895s][info   ][gc,phases      ] GC(50)   Evacuate Collection Set: 1.5ms
[0.895s][info   ][gc,phases      ] GC(50)   Post Evacuate Collection Set: 1.1ms
[0.895s][info   ][gc,phases      ] GC(50)   Other: 0.4ms
[0.895s][info   ][gc,heap        ] GC(50) Eden regions: 21->0(21)
[0.895s][info   ][gc,heap        ] GC(50) Survivor regions: 4->4(4)
[0.895s][info   ][gc,heap        ] GC(50) Old regions: 280->290
[0.895s][info   ][gc,heap        ] GC(50) Archive regions: 2->2
[0.895s][info   ][gc,heap        ] GC(50) Humongous regions: 180->166
[0.895s][info   ][gc,metaspace   ] GC(50) Metaspace: 209K(4864K)->209K(4864K) NonClass: 198K(4352K)->198K(4352K) Class: 11K(512K)->11K(512K)
[0.895s][info   ][gc             ] GC(50) Pause Young (Normal) (G1 Evacuation Pause) 458M->432M(512M) 4.141ms
[0.895s][info   ][gc,cpu         ] GC(50) User=0.00s Sys=0.00s Real=0.00s
[0.901s][info   ][gc,start       ] GC(51) Pause Young (Normal) (G1 Evacuation Pause)
[0.901s][info   ][gc,task        ] GC(51) Using 4 workers of 4 for evacuation
[0.905s][info   ][gc,phases      ] GC(51)   Pre Evacuate Collection Set: 0.3ms
[0.905s][info   ][gc,phases      ] GC(51)   Merge Heap Roots: 0.5ms
[0.905s][info   ][gc,phases      ] GC(51)   Evacuate Collection Set: 1.9ms
[0.905s][info   ][gc,phases      ] GC(51)   Post Evacuate Collection Set: 1.4ms
[0.906s][info   ][gc,phases      ] GC(51)   Other: 0.4ms
[0.906s][info   ][gc,heap        ] GC(51) Eden regions: 21->0(21)
[0.906s][info   ][gc,heap        ] GC(51) Survivor regions: 4->4(4)
[0.906s][info   ][gc,heap        ] GC(51) Old regions: 290->298
[0.906s][info   ][gc,heap        ] GC(51) Archive regions: 2->2
[0.906s][info   ][gc,heap        ] GC(51) Humongous regions: 181->164
[0.907s][info   ][gc,metaspace   ] GC(51) Metaspace: 209K(4864K)->209K(4864K) NonClass: 198K(4352K)->198K(4352K) Class: 11K(512K)->11K(512K)
[0.907s][info   ][gc             ] GC(51) Pause Young (Normal) (G1 Evacuation Pause) 468M->438M(512M) 6.424ms
[0.907s][info   ][gc,cpu         ] GC(51) User=0.00s Sys=0.00s Real=0.01s
[0.912s][info   ][gc,start       ] GC(52) Pause Young (Normal) (G1 Evacuation Pause)
[0.912s][info   ][gc,task        ] GC(52) Using 4 workers of 4 for evacuation
[0.917s][info   ][gc,phases      ] GC(52)   Pre Evacuate Collection Set: 0.3ms
[0.917s][info   ][gc,phases      ] GC(52)   Merge Heap Roots: 0.4ms
[0.917s][info   ][gc,phases      ] GC(52)   Evacuate Collection Set: 2.3ms
[0.917s][info   ][gc,phases      ] GC(52)   Post Evacuate Collection Set: 1.5ms
[0.917s][info   ][gc,phases      ] GC(52)   Other: 0.5ms
[0.917s][info   ][gc,heap        ] GC(52) Eden regions: 21->0(21)
[0.917s][info   ][gc,heap        ] GC(52) Survivor regions: 4->4(4)
[0.917s][info   ][gc,heap        ] GC(52) Old regions: 298->307
[0.917s][info   ][gc,heap        ] GC(52) Archive regions: 2->2
[0.917s][info   ][gc,heap        ] GC(52) Humongous regions: 172->160
[0.918s][info   ][gc,metaspace   ] GC(52) Metaspace: 209K(4864K)->209K(4864K) NonClass: 198K(4352K)->198K(4352K) Class: 11K(512K)->11K(512K)
[0.919s][info   ][gc             ] GC(52) Pause Young (Normal) (G1 Evacuation Pause) 467M->443M(512M) 6.738ms
[0.919s][info   ][gc,cpu         ] GC(52) User=0.00s Sys=0.00s Real=0.01s
[0.924s][info   ][gc,start       ] GC(53) Pause Young (Normal) (G1 Evacuation Pause)
[0.924s][info   ][gc,task        ] GC(53) Using 4 workers of 4 for evacuation
[0.928s][info   ][gc             ] GC(53) To-space exhausted
[0.928s][info   ][gc,phases      ] GC(53)   Pre Evacuate Collection Set: 0.3ms
[0.928s][info   ][gc,phases      ] GC(53)   Merge Heap Roots: 0.4ms
[0.928s][info   ][gc,phases      ] GC(53)   Evacuate Collection Set: 1.5ms
[0.928s][info   ][gc,phases      ] GC(53)   Post Evacuate Collection Set: 1.4ms
[0.929s][info   ][gc,phases      ] GC(53)   Other: 0.5ms
[0.929s][info   ][gc,heap        ] GC(53) Eden regions: 21->0(21)
[0.929s][info   ][gc,heap        ] GC(53) Survivor regions: 4->4(4)
[0.929s][info   ][gc,heap        ] GC(53) Old regions: 307->320
[0.929s][info   ][gc,heap        ] GC(53) Archive regions: 2->2
[0.929s][info   ][gc,heap        ] GC(53) Humongous regions: 170->159
[0.929s][info   ][gc,metaspace   ] GC(53) Metaspace: 209K(4864K)->209K(4864K) NonClass: 198K(4352K)->198K(4352K) Class: 11K(512K)->11K(512K)
[0.930s][info   ][gc             ] GC(53) Pause Young (Normal) (G1 Evacuation Pause) 474M->456M(512M) 5.553ms
[0.930s][info   ][gc,cpu         ] GC(53) User=0.00s Sys=0.00s Real=0.01s
[0.934s][info   ][gc,start       ] GC(54) Pause Young (Normal) (G1 Evacuation Pause)
[0.934s][info   ][gc,task        ] GC(54) Using 4 workers of 4 for evacuation
[0.937s][info   ][gc             ] GC(54) To-space exhausted
[0.937s][info   ][gc,phases      ] GC(54)   Pre Evacuate Collection Set: 0.3ms
[0.937s][info   ][gc,phases      ] GC(54)   Merge Heap Roots: 0.4ms
[0.937s][info   ][gc,phases      ] GC(54)   Evacuate Collection Set: 0.8ms
[0.937s][info   ][gc,phases      ] GC(54)   Post Evacuate Collection Set: 1.0ms
[0.937s][info   ][gc,phases      ] GC(54)   Other: 0.8ms
[0.937s][info   ][gc,heap        ] GC(54) Eden regions: 16->0(25)
[0.937s][info   ][gc,heap        ] GC(54) Survivor regions: 4->0(0)
[0.938s][info   ][gc,heap        ] GC(54) Old regions: 320->340
[0.938s][info   ][gc,heap        ] GC(54) Archive regions: 2->2
[0.938s][info   ][gc,heap        ] GC(54) Humongous regions: 170->161
[0.938s][info   ][gc,metaspace   ] GC(54) Metaspace: 209K(4864K)->209K(4864K) NonClass: 198K(4352K)->198K(4352K) Class: 11K(512K)->11K(512K)
[0.939s][info   ][gc             ] GC(54) Pause Young (Normal) (G1 Evacuation Pause) 483M->474M(512M) 4.699ms
[0.939s][info   ][gc,cpu         ] GC(54) User=0.00s Sys=0.00s Real=0.01s
[0.942s][info   ][gc,start       ] GC(55) Pause Young (Normal) (G1 Evacuation Pause)
[0.942s][info   ][gc,task        ] GC(55) Using 4 workers of 4 for evacuation
[0.947s][info   ][gc             ] GC(55) To-space exhausted
[0.947s][info   ][gc,phases      ] GC(55)   Pre Evacuate Collection Set: 0.6ms
[0.947s][info   ][gc,phases      ] GC(55)   Merge Heap Roots: 0.4ms
[0.947s][info   ][gc,phases      ] GC(55)   Evacuate Collection Set: 2.0ms
[0.947s][info   ][gc,phases      ] GC(55)   Post Evacuate Collection Set: 1.4ms
[0.947s][info   ][gc,phases      ] GC(55)   Other: 0.6ms
[0.947s][info   ][gc,heap        ] GC(55) Eden regions: 6->0(25)
[0.947s][info   ][gc,heap        ] GC(55) Survivor regions: 0->0(0)
[0.947s][info   ][gc,heap        ] GC(55) Old regions: 340->346
[0.947s][info   ][gc,heap        ] GC(55) Archive regions: 2->2
[0.948s][info   ][gc,heap        ] GC(55) Humongous regions: 164->159
[0.948s][info   ][gc,metaspace   ] GC(55) Metaspace: 209K(4864K)->209K(4864K) NonClass: 198K(4352K)->198K(4352K) Class: 11K(512K)->11K(512K)
[0.949s][info   ][gc             ] GC(55) Pause Young (Normal) (G1 Evacuation Pause) 483M->478M(512M) 7.375ms
[0.949s][info   ][gc,cpu         ] GC(55) User=0.00s Sys=0.00s Real=0.01s
[0.951s][info   ][gc,start       ] GC(56) Pause Young (Normal) (G1 Evacuation Pause)
[0.951s][info   ][gc,task        ] GC(56) Using 4 workers of 4 for evacuation
[0.957s][info   ][gc             ] GC(56) To-space exhausted
[0.957s][info   ][gc,phases      ] GC(56)   Pre Evacuate Collection Set: 0.5ms
[0.957s][info   ][gc,phases      ] GC(56)   Merge Heap Roots: 0.5ms
[0.957s][info   ][gc,phases      ] GC(56)   Evacuate Collection Set: 3.5ms
[0.957s][info   ][gc,phases      ] GC(56)   Post Evacuate Collection Set: 1.4ms
[0.957s][info   ][gc,phases      ] GC(56)   Other: 0.5ms
[0.958s][info   ][gc,heap        ] GC(56) Eden regions: 4->0(25)
[0.958s][info   ][gc,heap        ] GC(56) Survivor regions: 0->0(0)
[0.958s][info   ][gc,heap        ] GC(56) Old regions: 346->350
[0.958s][info   ][gc,heap        ] GC(56) Archive regions: 2->2
[0.958s][info   ][gc,heap        ] GC(56) Humongous regions: 160->160
[0.959s][info   ][gc,metaspace   ] GC(56) Metaspace: 209K(4864K)->209K(4864K) NonClass: 198K(4352K)->198K(4352K) Class: 11K(512K)->11K(512K)
[0.959s][info   ][gc             ] GC(56) Pause Young (Normal) (G1 Evacuation Pause) 483M->483M(512M) 8.100ms
[0.959s][info   ][gc,cpu         ] GC(56) User=0.01s Sys=0.01s Real=0.01s
[0.959s][info   ][gc,ergo        ] Attempting maximally compacting collection
[0.959s][info   ][gc,task        ] GC(57) Using 4 workers of 4 for full compaction
[0.960s][info   ][gc,start       ] GC(57) Pause Full (G1 Evacuation Pause)
[0.961s][info   ][gc,phases,start] GC(57) Phase 1: Mark live objects
[0.964s][info   ][gc,phases      ] GC(57) Phase 1: Mark live objects 3.057ms
[0.964s][info   ][gc,phases,start] GC(57) Phase 2: Prepare for compaction
[0.965s][info   ][gc,phases      ] GC(57) Phase 2: Prepare for compaction 1.028ms
[0.965s][info   ][gc,phases,start] GC(57) Phase 3: Adjust pointers
[0.966s][info   ][gc,phases      ] GC(57) Phase 3: Adjust pointers 1.147ms
[0.966s][info   ][gc,phases,start] GC(57) Phase 4: Compact heap
[0.979s][info   ][gc,phases      ] GC(57) Phase 4: Compact heap 12.598ms
[0.979s][info   ][gc,heap        ] GC(57) Eden regions: 0->0(40)
[0.979s][info   ][gc,heap        ] GC(57) Survivor regions: 0->0(0)
[0.979s][info   ][gc,heap        ] GC(57) Old regions: 350->226
[0.980s][info   ][gc,heap        ] GC(57) Archive regions: 2->2
[0.980s][info   ][gc,heap        ] GC(57) Humongous regions: 160->160
[0.980s][info   ][gc,metaspace   ] GC(57) Metaspace: 209K(4864K)->209K(4864K) NonClass: 198K(4352K)->198K(4352K) Class: 11K(512K)->11K(512K)
[0.980s][info   ][gc             ] GC(57) Pause Full (G1 Evacuation Pause) 483M->359M(512M) 20.741ms
[0.981s][info   ][gc,cpu         ] GC(57) User=0.04s Sys=0.00s Real=0.02s
[0.981s][info   ][gc,marking     ] GC(49) Concurrent Rebuild Remembered Sets 91.580ms
[0.982s][info   ][gc,marking     ] GC(49) Concurrent Mark Abort
[0.982s][info   ][gc             ] GC(49) Concurrent Cycle 99.905ms
[0.983s][info   ][gc,start       ] GC(58) Pause Young (Concurrent Start) (G1 Humongous Allocation)
[0.983s][info   ][gc,task        ] GC(58) Using 4 workers of 4 for evacuation
[0.986s][info   ][gc,phases      ] GC(58)   Pre Evacuate Collection Set: 0.4ms
[0.986s][info   ][gc,phases      ] GC(58)   Merge Heap Roots: 0.3ms
[0.986s][info   ][gc,phases      ] GC(58)   Evacuate Collection Set: 1.1ms
[0.986s][info   ][gc,phases      ] GC(58)   Post Evacuate Collection Set: 0.6ms
[0.986s][info   ][gc,phases      ] GC(58)   Other: 0.7ms
[0.986s][info   ][gc,heap        ] GC(58) Eden regions: 1->0(43)
[0.986s][info   ][gc,heap        ] GC(58) Survivor regions: 0->1(5)
[0.986s][info   ][gc,heap        ] GC(58) Old regions: 226->226
[0.986s][info   ][gc,heap        ] GC(58) Archive regions: 2->2
[0.986s][info   ][gc,heap        ] GC(58) Humongous regions: 160->160
[0.986s][info   ][gc,metaspace   ] GC(58) Metaspace: 209K(4864K)->209K(4864K) NonClass: 198K(4352K)->198K(4352K) Class: 11K(512K)->11K(512K)
[0.987s][info   ][gc             ] GC(58) Pause Young (Concurrent Start) (G1 Humongous Allocation) 359M->359M(512M) 4.146ms
[0.987s][info   ][gc,cpu         ] GC(58) User=0.00s Sys=0.00s Real=0.01s
[0.988s][info   ][gc             ] GC(59) Concurrent Cycle
[0.988s][info   ][gc,marking     ] GC(59) Concurrent Clear Claimed Marks
[0.988s][info   ][gc,marking     ] GC(59) Concurrent Clear Claimed Marks 0.076ms
[0.988s][info   ][gc,marking     ] GC(59) Concurrent Scan Root Regions
[0.988s][info   ][gc,marking     ] GC(59) Concurrent Scan Root Regions 0.174ms
[0.988s][info   ][gc,marking     ] GC(59) Concurrent Mark (0.988s)
[0.988s][info   ][gc,marking     ] GC(59) Concurrent Mark From Roots
[0.988s][info   ][gc,task        ] GC(59) Using 1 workers of 1 for marking
[0.992s][info   ][gc,marking     ] GC(59) Concurrent Mark From Roots 3.692ms
[0.992s][info   ][gc,marking     ] GC(59) Concurrent Preclean
[0.992s][info   ][gc,marking     ] GC(59) Concurrent Preclean 0.202ms
[0.992s][info   ][gc,marking     ] GC(59) Concurrent Mark (0.988s, 0.992s) 4.134ms
[0.993s][info   ][gc,start       ] GC(59) Pause Remark
[0.995s][info   ][gc             ] GC(59) Pause Remark 383M->383M(512M) 1.699ms
[0.995s][info   ][gc,cpu         ] GC(59) User=0.01s Sys=0.00s Real=0.00s
[0.995s][info   ][gc,marking     ] GC(59) Concurrent Rebuild Remembered Sets
[1.001s][info   ][gc,start       ] GC(60) Pause Young (Normal) (G1 Evacuation Pause)
[1.001s][info   ][gc,task        ] GC(60) Using 4 workers of 4 for evacuation
[1.006s][info   ][gc,phases      ] GC(60)   Pre Evacuate Collection Set: 0.2ms
[1.006s][info   ][gc,phases      ] GC(60)   Merge Heap Roots: 0.6ms
[1.006s][info   ][gc,phases      ] GC(60)   Evacuate Collection Set: 2.1ms
[1.006s][info   ][gc,phases      ] GC(60)   Post Evacuate Collection Set: 1.4ms
[1.006s][info   ][gc,phases      ] GC(60)   Other: 0.5ms
[1.006s][info   ][gc,heap        ] GC(60) Eden regions: 43->0(25)
[1.006s][info   ][gc,heap        ] GC(60) Survivor regions: 1->6(6)
[1.007s][info   ][gc,heap        ] GC(60) Old regions: 226->237
[1.007s][info   ][gc,heap        ] GC(60) Archive regions: 2->2
[1.007s][info   ][gc,heap        ] GC(60) Humongous regions: 185->170
[1.008s][info   ][gc,metaspace   ] GC(60) Metaspace: 209K(4864K)->209K(4864K) NonClass: 198K(4352K)->198K(4352K) Class: 11K(512K)->11K(512K)
[1.008s][info   ][gc             ] GC(60) Pause Young (Normal) (G1 Evacuation Pause) 427M->385M(512M) 6.864ms
[1.008s][info   ][gc,cpu         ] GC(60) User=0.01s Sys=0.01s Real=0.01s
[1.014s][info   ][gc,start       ] GC(61) Pause Young (Normal) (G1 Evacuation Pause)
[1.014s][info   ][gc,task        ] GC(61) Using 4 workers of 4 for evacuation
[1.017s][info   ][gc,phases      ] GC(61)   Pre Evacuate Collection Set: 0.2ms
[1.018s][info   ][gc,phases      ] GC(61)   Merge Heap Roots: 0.4ms
[1.018s][info   ][gc,phases      ] GC(61)   Evacuate Collection Set: 1.5ms
[1.018s][info   ][gc,phases      ] GC(61)   Post Evacuate Collection Set: 1.3ms
[1.018s][info   ][gc,phases      ] GC(61)   Other: 0.6ms
[1.018s][info   ][gc,heap        ] GC(61) Eden regions: 25->0(21)
[1.018s][info   ][gc,heap        ] GC(61) Survivor regions: 6->4(4)
[1.018s][info   ][gc,heap        ] GC(61) Old regions: 237->249
[1.018s][info   ][gc,heap        ] GC(61) Archive regions: 2->2
[1.018s][info   ][gc,heap        ] GC(61) Humongous regions: 193->185
[1.018s][info   ][gc,metaspace   ] GC(61) Metaspace: 209K(4864K)->209K(4864K) NonClass: 198K(4352K)->198K(4352K) Class: 11K(512K)->11K(512K)
[1.018s][info   ][gc             ] GC(61) Pause Young (Normal) (G1 Evacuation Pause) 433M->410M(512M) 4.446ms
[1.019s][info   ][gc,cpu         ] GC(61) User=0.00s Sys=0.01s Real=0.01s
[1.025s][info   ][gc,start       ] GC(62) Pause Young (Normal) (G1 Evacuation Pause)
[1.025s][info   ][gc,task        ] GC(62) Using 4 workers of 4 for evacuation
[1.029s][info   ][gc,phases      ] GC(62)   Pre Evacuate Collection Set: 0.5ms
[1.029s][info   ][gc,phases      ] GC(62)   Merge Heap Roots: 0.3ms
[1.029s][info   ][gc,phases      ] GC(62)   Evacuate Collection Set: 1.7ms
[1.029s][info   ][gc,phases      ] GC(62)   Post Evacuate Collection Set: 1.3ms
[1.029s][info   ][gc,phases      ] GC(62)   Other: 0.8ms
[1.029s][info   ][gc,heap        ] GC(62) Eden regions: 21->0(21)
[1.029s][info   ][gc,heap        ] GC(62) Survivor regions: 4->4(4)
[1.029s][info   ][gc,heap        ] GC(62) Old regions: 249->255
[1.029s][info   ][gc,heap        ] GC(62) Archive regions: 2->2
[1.029s][info   ][gc,heap        ] GC(62) Humongous regions: 199->187
[1.029s][info   ][gc,metaspace   ] GC(62) Metaspace: 209K(4864K)->209K(4864K) NonClass: 198K(4352K)->198K(4352K) Class: 11K(512K)->11K(512K)
[1.030s][info   ][gc             ] GC(62) Pause Young (Normal) (G1 Evacuation Pause) 445M->418M(512M) 5.336ms
[1.030s][info   ][gc,cpu         ] GC(62) User=0.00s Sys=0.01s Real=0.01s
[1.035s][info   ][gc,start       ] GC(63) Pause Young (Normal) (G1 Evacuation Pause)
[1.035s][info   ][gc,task        ] GC(63) Using 4 workers of 4 for evacuation
[1.039s][info   ][gc,phases      ] GC(63)   Pre Evacuate Collection Set: 0.4ms
[1.039s][info   ][gc,phases      ] GC(63)   Merge Heap Roots: 0.4ms
[1.039s][info   ][gc,phases      ] GC(63)   Evacuate Collection Set: 1.6ms
[1.039s][info   ][gc,phases      ] GC(63)   Post Evacuate Collection Set: 1.2ms
[1.039s][info   ][gc,phases      ] GC(63)   Other: 0.6ms
[1.039s][info   ][gc,heap        ] GC(63) Eden regions: 21->0(21)
[1.039s][info   ][gc,heap        ] GC(63) Survivor regions: 4->4(4)
[1.039s][info   ][gc,heap        ] GC(63) Old regions: 255->262
[1.039s][info   ][gc,heap        ] GC(63) Archive regions: 2->2
[1.039s][info   ][gc,heap        ] GC(63) Humongous regions: 200->192
[1.039s][info   ][gc,metaspace   ] GC(63) Metaspace: 209K(4864K)->209K(4864K) NonClass: 198K(4352K)->198K(4352K) Class: 11K(512K)->11K(512K)
[1.039s][info   ][gc             ] GC(63) Pause Young (Normal) (G1 Evacuation Pause) 452M->430M(512M) 4.634ms
[1.039s][info   ][gc,cpu         ] GC(63) User=0.01s Sys=0.01s Real=0.01s
[1.044s][info   ][gc,start       ] GC(64) Pause Young (Normal) (G1 Evacuation Pause)
[1.044s][info   ][gc,task        ] GC(64) Using 4 workers of 4 for evacuation
[1.048s][info   ][gc,phases      ] GC(64)   Pre Evacuate Collection Set: 0.3ms
[1.048s][info   ][gc,phases      ] GC(64)   Merge Heap Roots: 0.4ms
[1.048s][info   ][gc,phases      ] GC(64)   Evacuate Collection Set: 1.4ms
[1.048s][info   ][gc,phases      ] GC(64)   Post Evacuate Collection Set: 1.3ms
[1.048s][info   ][gc,phases      ] GC(64)   Other: 0.4ms
[1.048s][info   ][gc,heap        ] GC(64) Eden regions: 21->0(21)
[1.048s][info   ][gc,heap        ] GC(64) Survivor regions: 4->4(4)
[1.048s][info   ][gc,heap        ] GC(64) Old regions: 262->269
[1.048s][info   ][gc,heap        ] GC(64) Archive regions: 2->2
[1.049s][info   ][gc,heap        ] GC(64) Humongous regions: 206->199
[1.049s][info   ][gc,metaspace   ] GC(64) Metaspace: 209K(4864K)->209K(4864K) NonClass: 198K(4352K)->198K(4352K) Class: 11K(512K)->11K(512K)
[1.049s][info   ][gc             ] GC(64) Pause Young (Normal) (G1 Evacuation Pause) 465M->444M(512M) 4.889ms
[1.049s][info   ][gc,cpu         ] GC(64) User=0.00s Sys=0.01s Real=0.01s
[1.052s][info   ][gc,marking     ] GC(59) Concurrent Rebuild Remembered Sets 57.483ms
[1.053s][info   ][gc,start       ] GC(59) Pause Cleanup
[1.054s][info   ][gc             ] GC(59) Pause Cleanup 463M->463M(512M) 0.980ms
[1.054s][info   ][gc,cpu         ] GC(59) User=0.00s Sys=0.00s Real=0.00s
[1.054s][info   ][gc,marking     ] GC(59) Concurrent Cleanup for Next Mark
[1.056s][info   ][gc,marking     ] GC(59) Concurrent Cleanup for Next Mark 1.290ms
[1.056s][info   ][gc             ] GC(59) Concurrent Cycle 68.117ms
[1.058s][info   ][gc,start       ] GC(65) Pause Young (Concurrent Start) (G1 Humongous Allocation)
[1.058s][info   ][gc,task        ] GC(65) Using 4 workers of 4 for evacuation
[1.063s][info   ][gc             ] GC(65) To-space exhausted
[1.063s][info   ][gc,phases      ] GC(65)   Pre Evacuate Collection Set: 0.2ms
[1.063s][info   ][gc,phases      ] GC(65)   Merge Heap Roots: 0.5ms
[1.063s][info   ][gc,phases      ] GC(65)   Evacuate Collection Set: 1.7ms
[1.063s][info   ][gc,phases      ] GC(65)   Post Evacuate Collection Set: 1.8ms
[1.063s][info   ][gc,phases      ] GC(65)   Other: 0.8ms
[1.063s][info   ][gc,heap        ] GC(65) Eden regions: 19->0(21)
[1.063s][info   ][gc,heap        ] GC(65) Survivor regions: 4->4(4)
[1.063s][info   ][gc,heap        ] GC(65) Old regions: 269->286
[1.063s][info   ][gc,heap        ] GC(65) Archive regions: 2->2
[1.063s][info   ][gc,heap        ] GC(65) Humongous regions: 207->165
[1.063s][info   ][gc,metaspace   ] GC(65) Metaspace: 209K(4864K)->209K(4864K) NonClass: 198K(4352K)->198K(4352K) Class: 11K(512K)->11K(512K)
[1.064s][info   ][gc             ] GC(65) Pause Young (Concurrent Start) (G1 Humongous Allocation) 470M->428M(512M) 6.075ms
[1.065s][info   ][gc,cpu         ] GC(65) User=0.00s Sys=0.00s Real=0.00s
[1.065s][info   ][gc             ] GC(66) Concurrent Cycle
[1.065s][info   ][gc,marking     ] GC(66) Concurrent Clear Claimed Marks
[1.066s][info   ][gc,marking     ] GC(66) Concurrent Clear Claimed Marks 0.169ms
[1.066s][info   ][gc,marking     ] GC(66) Concurrent Scan Root Regions
[1.066s][info   ][gc,marking     ] GC(66) Concurrent Scan Root Regions 0.278ms
[1.066s][info   ][gc,marking     ] GC(66) Concurrent Mark (1.066s)
[1.066s][info   ][gc,marking     ] GC(66) Concurrent Mark From Roots
[1.066s][info   ][gc,task        ] GC(66) Using 1 workers of 1 for marking
[1.071s][info   ][gc,marking     ] GC(66) Concurrent Mark From Roots 4.816ms
[1.071s][info   ][gc,marking     ] GC(66) Concurrent Preclean
[1.071s][info   ][gc,marking     ] GC(66) Concurrent Preclean 0.269ms
[1.072s][info   ][gc,marking     ] GC(66) Concurrent Mark (1.066s, 1.072s) 5.319ms
[1.072s][info   ][gc,start       ] GC(66) Pause Remark
[1.074s][info   ][gc             ] GC(66) Pause Remark 458M->457M(512M) 2.184ms
[1.075s][info   ][gc,cpu         ] GC(66) User=0.00s Sys=0.00s Real=0.00s
[1.075s][info   ][gc,marking     ] GC(66) Concurrent Rebuild Remembered Sets
[1.077s][info   ][gc,start       ] GC(67) Pause Young (Normal) (G1 Evacuation Pause)
[1.077s][info   ][gc,task        ] GC(67) Using 4 workers of 4 for evacuation
[1.081s][info   ][gc,phases      ] GC(67)   Pre Evacuate Collection Set: 0.5ms
[1.081s][info   ][gc,phases      ] GC(67)   Merge Heap Roots: 0.4ms
[1.081s][info   ][gc,phases      ] GC(67)   Evacuate Collection Set: 1.9ms
[1.081s][info   ][gc,phases      ] GC(67)   Post Evacuate Collection Set: 1.5ms
[1.082s][info   ][gc,phases      ] GC(67)   Other: 0.5ms
[1.082s][info   ][gc,heap        ] GC(67) Eden regions: 21->0(21)
[1.082s][info   ][gc,heap        ] GC(67) Survivor regions: 4->4(4)
[1.082s][info   ][gc,heap        ] GC(67) Old regions: 285->294
[1.082s][info   ][gc,heap        ] GC(67) Archive regions: 2->2
[1.082s][info   ][gc,heap        ] GC(67) Humongous regions: 176->166
[1.082s][info   ][gc,metaspace   ] GC(67) Metaspace: 209K(4864K)->209K(4864K) NonClass: 198K(4352K)->198K(4352K) Class: 11K(512K)->11K(512K)
[1.082s][info   ][gc             ] GC(67) Pause Young (Normal) (G1 Evacuation Pause) 458M->436M(512M) 5.204ms
[1.082s][info   ][gc,cpu         ] GC(67) User=0.00s Sys=0.01s Real=0.00s
[1.088s][info   ][gc,start       ] GC(68) Pause Young (Normal) (G1 Evacuation Pause)
[1.088s][info   ][gc,task        ] GC(68) Using 4 workers of 4 for evacuation
[1.092s][info   ][gc             ] GC(68) To-space exhausted
[1.092s][info   ][gc,phases      ] GC(68)   Pre Evacuate Collection Set: 0.2ms
[1.092s][info   ][gc,phases      ] GC(68)   Merge Heap Roots: 0.5ms
[1.093s][info   ][gc,phases      ] GC(68)   Evacuate Collection Set: 1.9ms
[1.093s][info   ][gc,phases      ] GC(68)   Post Evacuate Collection Set: 1.5ms
[1.093s][info   ][gc,phases      ] GC(68)   Other: 0.7ms
[1.093s][info   ][gc,heap        ] GC(68) Eden regions: 21->0(21)
[1.093s][info   ][gc,heap        ] GC(68) Survivor regions: 4->4(4)
[1.093s][info   ][gc,heap        ] GC(68) Old regions: 294->305
[1.093s][info   ][gc,heap        ] GC(68) Archive regions: 2->2
[1.093s][info   ][gc,heap        ] GC(68) Humongous regions: 178->163
[1.093s][info   ][gc,metaspace   ] GC(68) Metaspace: 209K(4864K)->209K(4864K) NonClass: 198K(4352K)->198K(4352K) Class: 11K(512K)->11K(512K)
[1.093s][info   ][gc             ] GC(68) Pause Young (Normal) (G1 Evacuation Pause) 469M->445M(512M) 5.523ms
[1.093s][info   ][gc,cpu         ] GC(68) User=0.00s Sys=0.00s Real=0.00s
[1.125s][info   ][gc,marking     ] GC(66) Concurrent Rebuild Remembered Sets 50.337ms
[1.126s][info   ][gc,start       ] GC(66) Pause Cleanup
[1.127s][info   ][gc             ] GC(66) Pause Cleanup 450M->450M(512M) 1.052ms
[1.127s][info   ][gc,cpu         ] GC(66) User=0.00s Sys=0.00s Real=0.01s
[1.127s][info   ][gc,marking     ] GC(66) Concurrent Cleanup for Next Mark
[1.129s][info   ][gc,marking     ] GC(66) Concurrent Cleanup for Next Mark 1.351ms
[1.129s][info   ][gc             ] GC(66) Concurrent Cycle 63.237ms
????????????: 10576
[1.134s][info   ][gc,heap,exit   ] Heap
[1.134s][info   ][gc,heap,exit   ]  garbage-first heap   total 524288K, used 459793K [0x00000000e0000000, 0x0000000100000000)
[1.134s][info   ][gc,heap,exit   ]   region size 1024K, 10 young (10240K), 4 survivors (4096K)
[1.134s][info   ][gc,heap,exit   ]  Metaspace       used 340K, capacity 4508K, committed 4864K, reserved 1056768K
[1.134s][info   ][gc,heap,exit   ]   class space    used 25K, capacity 392K, committed 512K, reserved 1048576K
```
G1 gc次数暴多，发生两次full gc，old regions不断增加\\
**请老师麻烦解释一下gc实际现象差异的原因，谢谢~**

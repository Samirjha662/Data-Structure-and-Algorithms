1class Solution {
2    public boolean isValid(String s){
3        Stack<Character> st = new Stack();
4        int top=-1;
5
6        for(int i =0; i< s.length() ;i++){
7            char ch = s.charAt(i);
8            if(ch =='(' || ch =='{' || ch =='['){
9                st.push(ch);
10            }else{
11                if(st.isEmpty()) return false;
12
13                if((ch ==')' && st.peek()!='(') || (ch =='}' && st.peek()!='{') ||(ch ==']' && st.peek()!='[')) return false;
14                st.pop();
15            }
16        }
17
18
19        return st.isEmpty();
20    }}
21
22
23
24
25
26
27
28
29
30
31
32
33
34
35
36
37
38
39
40
41
42
43
44
45
46
47
48
49
50
51
52
53
54
55
56
57
58
59
60
61
62
63
64
65
66
67
68
69
70
71
72
73
74
75
76
77
78
79
80
81
82
83
84
85
86
87
88
89
90
91
92
93
94
95
96
97
98
99
100
101
102
103
104
105
106
107
108
109
110
111
112
113
114
115
116
117
118
119
120
121
122
123
124
125
126
127
128
129
130
131
132
133
134
135
136
137
138
139
140
141
142
143
144
145
146
147
148
149    // public boolean isValid(String s ){
150    //     char [] ch = new char[s.length()];
151    //     int top =0;
152
153    //     for(char c :s.toCharArray()){
154    //     switch(c){
155    //         case '(':
156    //              ch[top++] =')';
157    //              break;
158    //         case '[':
159    //              ch[top++] =']';
160    //              break;
161    //         case '{':
162    //              ch[top++] ='}';
163    //              break;
164    //         default:
165    //                if(top==0 || ch[--top] !=c){
166    //                 return false;
167    //                }
168    //     }
169    //     }
170
171    //         return top==0;
172    //     }
173    // }
174    // public boolean isValid(String s) {
175
176    //     Stack<Character> st = new Stack();
177
178    //     for(char ch : s.toCharArray()){
179
180    //         if(ch =='(' || ch =='[' || ch =='{'){
181    //             st.push(ch);
182    //         }
183    //         else{
184    //              if(st.isEmpty()){
185    //                 return false;
186    //              }
187    //          if((ch==')' && st.peek()!='(') || 
188    //            (ch==']' && st.peek()!='[') || 
189    //            (ch=='}' && st.peek()!='{')) {
190    //             return false;   
191    //         }
192             
193    //         st.pop();
194    //         }
195
196            
197    //     }
198       
199    //     return st.isEmpty();    
200    // }
201// }
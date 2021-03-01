package main

import (
	"bufio"
	"fmt"
	"os"
	"strings"
)

func main() {
	r := bufio.NewReaderSize(os.Stdin, 8 * 1000000)
	w := bufio.NewWriterSize(os.Stdout, 8 * 1000000)
	defer w.Flush()

	var n int
	fmt.Fscanln(r, &n)
	sb, _, _ := r.ReadLine()
	s := string(sb)
	tb, _, _ := r.ReadLine()
	t := string(tb)

	an := strings.Split(s, " ")
	bn := strings.Split(t, " ")

	var ans int = 0
	var f bool = an[0] != bn[0]
	for i := 0; i < n; i++ {
		if an[i] != bn[i] {
			if f {
				ans += 1
				f = false
			}
		} else {
			f = true
		}
	}
	fmt.Fprintln(w, ans)
}

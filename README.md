How Does the Code Work?
Let’s imagine we have a board with boxes labeled from 0 to the amount we want to make (let’s say 4). Each box will tell us how many ways we can make that amount. For example:

Box 0 = 1 way (don’t use any coins to make 0 rupees).
Other boxes start at 0 because we don’t know yet.
Now, we do this step-by-step:

Start with the smallest coin (1 rupee):

You go to each box and ask, "If I use a 1 rupee coin, how many ways can I make this amount?"
Update the boxes to include these new ways.
Move to the next coin (2 rupees):

Now, ask again, "If I use a 2 rupee coin, how many new ways can I make these amounts?"
Update the boxes again.
Do the same for 3 rupees.

At the end, the number in the box for 4 rupees tells you how many ways you can make 4 rupees.

Why Does This Work?
You’re keeping track of all the possible ways to make each amount. You start small (with the smallest coin) and keep adding more possibilities as you include bigger coins.

It’s like building with LEGO pieces: first, you see what you can make with small blocks, then you add bigger blocks, and so on. By the end, you know all the different ways to build your "tower" (the amount you want).

Example: Making 4 Rupees with Coins [1, 2, 3]
Start with no coins:

Ways to make 0 rupees: 1 (just do nothing).
Add 1-rupee coins:

Ways to make 1 rupee: 1 (just one 1-rupee coin).
Ways to make 2 rupees: 1 (two 1-rupee coins).
Ways to make 3 rupees: 1 (three 1-rupee coins).
Ways to make 4 rupees: 1 (four 1-rupee coins).
Add 2-rupee coins:

Ways to make 2 rupees: +1 (use one 2-rupee coin).
Ways to make 3 rupees: +1 (one 2-rupee coin + one 1-rupee coin).
Ways to make 4 rupees: +1 (two 2-rupee coins).
Add 3-rupee coins:

Ways to make 3 rupees: +1 (one 3-rupee coin).
Ways to make 4 rupees: +1 (one 3-rupee coin + one 1-rupee coin)

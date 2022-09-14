ArrayList<Integer> list=new ArrayList<>();
int i;
int count=0;
for(i=0;i<size;i++)
{
    if(arr[i]>0)
    {
        list.add(arr[i]);
        count++;
    }
}
if(count==0||!list.contains(1))
{
    return 1; 
}
int m=Integer.MAX_VALUE;

    for(i=0;i<count;i++)
    {
        if(!list.contains(list.get(i)+1))
        {
            m=Math.min(m,list.get(i)+1);
        }
    }

    return m;
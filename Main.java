class FindRecursive
{


    int i = 0;
    void find_recursiva( int[] nums, int find)
    {
        if (nums.length == 0)
            System.out.println("Lista vazia");
        else
        {

            if (i+1 <= nums.length){
                if(nums[i]==find){
                    System.out.println("Verdadeiro");
                    return;
                }

                i++;
                find_recursiva(nums, find);
            }else {System.out.println("Falso");}
        }

    }

    public static void main(String[] args)
    {
        int[] nums = {1,2,3,4,5,6,7,8};
        FindRecursive obj = new FindRecursive();
        obj.find_recursiva(nums,8);
    }
}

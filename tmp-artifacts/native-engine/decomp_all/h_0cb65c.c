// entry=0xcb65c

void Hcb65c(code *param_1,undefined8 param_2)

{
  uint uVar1;
  uint uVar2;
  undefined8 uVar3;
  undefined8 in_stack_00000010;
  
  uVar3 = (*param_1)(param_2,1);
  uVar1 = -(int)DAT_00281748;
  (*(code *)(&DAT_0029e620)
            [(long)(int)((uVar1 | 0xde8ac507) + (uVar1 & 0xde8ac507)) * 0x2b +
             (long)(int)(-0x21753aec - (-(int)DAT_00281748 ^ 0xffffffffU))])
            (in_stack_00000010,DAT_0029e868);
  uVar1 = -(int)DAT_00281748;
  (*(code *)(&DAT_0029e620)
            [(long)(int)((uVar1 ^ 0xde8ac507) + (uVar1 & 0xde8ac507) * 2) * 0x2b +
             (long)(int)(-0x21753af5 - (-(int)DAT_00281748 ^ 0xffffffffU))])
            (in_stack_00000010,uVar3);
  uVar1 = -(int)DAT_00281748;
  uVar2 = -(int)DAT_00281748;
  (*(code *)(&DAT_0029e620)
            [(long)(int)((uVar2 ^ 0xde8ac507) + (uVar2 & 0xde8ac507) * 2) * 0x2b +
             (long)(int)((uVar1 | 0xde8ac50c) + (uVar1 & 0xde8ac50c))])(in_stack_00000010);
  uVar1 = -(int)DAT_00281748;
  uVar2 = -(int)DAT_00281748;
  (*(code *)(&DAT_0029e620)
            [(long)(int)((uVar1 | 0xde8ac507) * 2 - (uVar1 ^ 0xde8ac507)) * 0x2b +
             (long)(int)((uVar2 ^ 0xde8ac50c) + (uVar2 & 0xde8ac50c) * 2)])(in_stack_00000010);
  uVar1 = -(int)DAT_00281748;
  uVar2 = -(int)DAT_00281748;
  (*(code *)(&DAT_0029e620)
            [(long)(int)((uVar1 ^ 0xde8ac507) + (uVar1 & 0xde8ac507) * 2) * 0x2b +
             (long)(int)((uVar2 | 0xde8ac50c) * 2 - (uVar2 ^ 0xde8ac50c))])(in_stack_00000010);
                    /* WARNING: Could not recover jumptable at 0x001cb658. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_00285b18)(in_stack_00000010);
  return;
}



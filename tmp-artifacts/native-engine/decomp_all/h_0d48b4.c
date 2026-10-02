// entry=0xd48b4

void Hd48b4(void)

{
  ushort uVar1;
  ushort in_w8;
  
  uVar1 = (-(short)DAT_0027db08 | 0xa968U) + (-(short)DAT_0027db08 & 0xa968U);
                    /* WARNING: Could not recover jumptable at 0x001d490c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_002859f8)(in_w8 & uVar1 | in_w8 ^ uVar1);
  return;
}



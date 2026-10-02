// entry=0xa68c8

void Ha68c8(void)

{
  ulong in_x17;
  long lVar1;
  ulong uVar2;
  long *unaff_x25;
  
  lVar1 = *unaff_x25;
  uVar2 = 0;
  do {
    (*(code *)(&PTR_FUN_0027c1e0)
              [(long)(int)(0x56e407bf - (-(int)DAT_0027fb18 ^ 0xffffffffU)) * 300 +
               (long)(int)(0x56e4080f - (-(int)DAT_0027fb18 ^ 0xffffffffU))])
              (*(undefined8 *)(lVar1 + uVar2 * 8));
    uVar2 = uVar2 + 1;
  } while (uVar2 != (in_x17 & 0xffffffff));
                    /* WARNING: Could not recover jumptable at 0x001a85f8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)(&PTR_LAB_00279580)
            [(long)(int)((-(int)DAT_0027fb18 ^ 0x56e407c0U) + (-(int)DAT_0027fb18 & 0x56e407c0U) * 2
                        ) * 0x6e])();
  return;
}



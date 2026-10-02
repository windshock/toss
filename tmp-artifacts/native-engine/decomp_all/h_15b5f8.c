// entry=0x15b5f8

void H15b5f8(undefined8 param_1,undefined8 param_2)

{
  undefined **ppuVar1;
  undefined *UNRECOVERED_JUMPTABLE;
  long lVar2;
  int iVar3;
  ulong in_x9;
  long unaff_x19;
  
  iVar3 = (int)DAT_00285720;
  if ((in_x9 & 1) == 0) {
    lVar2 = *(long *)(**(long **)(unaff_x19 + 0x68) + 8);
    *(undefined8 *)
     (&stack0x00000000 +
     -((ulong)((-iVar3 | 0x4b98a2a1U) + (-iVar3 & 0x4b98a2a1U) + (int)lVar2) * 8 + 0xf & 0xffffffff0
      )) = *(undefined8 *)(unaff_x19 + 0x10);
    ppuVar1 = &PTR_LAB_00275090 +
              (long)(int)((-iVar3 ^ 0x4b98a2a0U) + (-iVar3 & 0x4b98a2a0U) * 2) * 0x5e;
    if (lVar2 != 0) {
      ppuVar1 = &PTR_LAB_0027d700;
    }
                    /* WARNING: Could not recover jumptable at 0x0025ce5c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)*ppuVar1)();
    return;
  }
  (*(code *)(&PTR_FUN_0027c1e0)
            [(long)(int)((-iVar3 ^ 0x4b98a2a0U) + (-iVar3 & 0x4b98a2a0U) * 2) * 300 +
             (long)(int)(0x4b98a387 - (-iVar3 ^ 0xffffffffU))])
            (3,param_2,*(undefined8 *)(unaff_x19 + 0x68));
  UNRECOVERED_JUMPTABLE = PTR_LAB_0027db58;
  *(uint *)(unaff_x19 + 0xc) = -1 - ((uint)DAT_00285720 & 1);
                    /* WARNING: Could not recover jumptable at 0x0025ef50. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)UNRECOVERED_JUMPTABLE)();
  return;
}



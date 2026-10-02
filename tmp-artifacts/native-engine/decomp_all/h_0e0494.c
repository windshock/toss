// entry=0xe0494

void He0494(code *param_1)

{
  long unaff_x19;
  
  (*param_1)(*(undefined8 *)(unaff_x19 + 0x30),*(undefined8 *)(unaff_x19 + 0x28),2);
  CallSupervisor(0);
                    /* WARNING: Could not recover jumptable at 0x001dd008. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)(&PTR_LAB_00278e20)
            [(long)(int)((-(int)DAT_00274f48 | 0xcbf878acU) * 2 - (-(int)DAT_00274f48 ^ 0xcbf878acU)
                        ) * 0x79])();
  return;
}


